# VIATRA Query project for ViewModel

In order to build this project with Tycho,
it contains several diry hacks.

## The problem: using Xcore with VIATRA Query

VIATRA and Xcore implement the resolution of required Ecore packaages vastly differently.
Arguably, Xcore's approach is more in line with how `XImportSection` works;
however, VIATRA's approach is a lot simpler in headless builds.

When running outside Eclipse,
Xcore must load each EMF model into the resource set from the classpath.
This is done by `XcoreStandaloneSetup.XcoreResourceSetInitializer`.
In contrast, VIATRA implements its own infrastructure of package resolution independently of
(but optionally delegating to) the `EPackage` Registry.

## Behavior inside Eclipse

As a consequence,
when running inside the Eclipse IDE,
the VQL import

```
import "http://www.eclipse.org/emf/2002/Ecore"
```

will resolve to a different `EPackage` than the references inside imported packages that are defined using Xcore.
This leads to duplicate `EPackage` errors in the editor.

As a workaround, we use the(incorrect)

```
import "platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore"
```

import, which resolves to the same `EPackage` as in Xcore.

## Behavior with Maven

Naturally, the `"platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore"` import is meaningless outside Eclipse without further configuration.

In order to reference an `EPackage`,
it is not enough to merely place it on the classpath,
it must also be registered within the `EPackage` Registry manually.
This is done either by pointing to its generator model,
or loading its generated `Package` class.

By specifying a `packageClass`, we take the latter route.
However, this means we must remap the `platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore` URI to the `EcorePackage.eINSTANCE` on the classpath.
This is impossible by the `uriMappings` configuration of `viatra-maven-plugin`,
because we can only map to "real", resolvable URI of an `*.ecore` file.

The alternative of loading each `EPackage` (including Ecore) by its generator model is also impossible:
our Xcore models need a special resource factory to operate as generator models,
but `viatra-maven-plugin` has no hooks for loading such.

A hybrid approach, which loads Ecore by its generator model,
but load the packages defined with Xcore by thier generated `EPackage` classes,
also fails, because the generated classes suppose that
`http://www.eclipse.org/emf/2002/Ecore` resolves to a `EcorePackage` instance inside the Registry,
not an `EPackageImpl` instance.

_Note:_ The generator and Ecore models of the Ecore package can be accessed inside the pom like

```
jar:file:${p2.eclipse-plugin:org.eclipse.emf.ecore:jar}!/model/Ecore.genmodel
```

after binding the `properties` goal of the `maven-dependency-plugin` in the `initialize` phase.

## Workaround

This results in a very heavy-handed workaround:

1. An ant script, `sanitize-vql.xml` replaces each import of the Ecore package inside VQL files with `http://www.eclipse.org/emf/2002/Ecore`, and outputs the result into the `vql-gen` folder.
2. The ant script is invoked from Eclipse as a builder. This guarantees that `vql-gen` is updated even if we don't call Maven.
3. The `maven-antrun-plugin` invokes the ant script in the `generated-sources` phase before `viatra-maven-plugin`.
4. `src` is deliberately not added to `build.properties`, but `vql-gen` and `src-gen` are, so that the original VQL files are not processed by Tycho.
5. In contrast, `vql-gen` is not a source folder, only `src` and `src-gen`, so that the VIATRA builder inside Eclipse sees the correct URIs.
6. A resource filter ignores any `*.vql` files in `vql-gen` to avoid duplicate definition of queries.
7. Warnings about inconsistent `sources` in `build.properties` are silenced in the project settings, because we deliberately messed up the source entries.

To sum up:

* Eclipse sees the platform resource import, and resolves the correct `EPackage` at design time.
* We replace imports before they are passed to `viatra-maven-plugin`, so it sees the nsURI.
* The VQL sources inside the final package also contain the nsURI.
* If for some reason a package is exported directly from Eclipse, the VQL sources also come from `vql-gen` despite the resource filter, so they also contain the nsURI.

The resulting packages can probably be used without problems inside or outside Eclipse,
because the VQL sources are only preserved for debugging purposes.


