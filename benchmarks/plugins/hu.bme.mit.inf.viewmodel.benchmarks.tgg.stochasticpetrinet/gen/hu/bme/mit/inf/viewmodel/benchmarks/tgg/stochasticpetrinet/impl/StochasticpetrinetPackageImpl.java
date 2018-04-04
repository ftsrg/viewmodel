/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StochasticpetrinetPackageImpl extends EPackageImpl implements StochasticpetrinetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "stochasticpetrinet.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorToFailedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeToOperationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorToOperationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaphoreToFailedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchToFailedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeToRepairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaphoreToOperationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchToOperationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeToFailedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railwayContainerToPetriNetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StochasticpetrinetPackageImpl() {
		super(eNS_URI, StochasticpetrinetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StochasticpetrinetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static StochasticpetrinetPackage init() {
		if (isInited)
			return (StochasticpetrinetPackage) EPackage.Registry.INSTANCE
					.getEPackage(StochasticpetrinetPackage.eNS_URI);

		// Obtain or create and register package
		StochasticpetrinetPackageImpl theStochasticpetrinetPackage = (StochasticpetrinetPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof StochasticpetrinetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new StochasticpetrinetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RailwayPackage.eINSTANCE.eClass();
		StochasticPetriNetPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
						: RulesPackage.eINSTANCE);

		// Load packages
		theStochasticpetrinetPackage.loadPackage();

		// Fix loaded packages
		theStochasticpetrinetPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theStochasticpetrinetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StochasticpetrinetPackage.eNS_URI, theStochasticpetrinetPackage);
		return theStochasticpetrinetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorToFailed() {
		if (sensorToFailedEClass == null) {
			sensorToFailedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(StochasticpetrinetPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return sensorToFailedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorToFailed_Source() {
		return (EReference) getSensorToFailed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorToFailed_Target() {
		return (EReference) getSensorToFailed().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteToOperational() {
		if (routeToOperationalEClass == null) {
			routeToOperationalEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(StochasticpetrinetPackage.eNS_URI).getEClassifiers().get(1);
		}
		return routeToOperationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteToOperational_Source() {
		return (EReference) getRouteToOperational().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteToOperational_Target() {
		return (EReference) getRouteToOperational().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorToOperational() {
		if (sensorToOperationalEClass == null) {
			sensorToOperationalEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(StochasticpetrinetPackage.eNS_URI).getEClassifiers().get(2);
		}
		return sensorToOperationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorToOperational_Source() {
		return (EReference) getSensorToOperational().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorToOperational_Target() {
		return (EReference) getSensorToOperational().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaphoreToFailed() {
		if (semaphoreToFailedEClass == null) {
			semaphoreToFailedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(StochasticpetrinetPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return semaphoreToFailedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreToFailed_Source() {
		return (EReference) getSemaphoreToFailed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreToFailed_Target() {
		return (EReference) getSemaphoreToFailed().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchToFailed() {
		if (switchToFailedEClass == null) {
			switchToFailedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(StochasticpetrinetPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return switchToFailedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchToFailed_Source() {
		return (EReference) getSwitchToFailed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchToFailed_Target() {
		return (EReference) getSwitchToFailed().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteToRepair() {
		if (routeToRepairEClass == null) {
			routeToRepairEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(StochasticpetrinetPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return routeToRepairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteToRepair_Source() {
		return (EReference) getRouteToRepair().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteToRepair_Target() {
		return (EReference) getRouteToRepair().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaphoreToOperational() {
		if (semaphoreToOperationalEClass == null) {
			semaphoreToOperationalEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(StochasticpetrinetPackage.eNS_URI).getEClassifiers().get(6);
		}
		return semaphoreToOperationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreToOperational_Source() {
		return (EReference) getSemaphoreToOperational().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemaphoreToOperational_Target() {
		return (EReference) getSemaphoreToOperational().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchToOperational() {
		if (switchToOperationalEClass == null) {
			switchToOperationalEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(StochasticpetrinetPackage.eNS_URI).getEClassifiers().get(7);
		}
		return switchToOperationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchToOperational_Source() {
		return (EReference) getSwitchToOperational().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchToOperational_Target() {
		return (EReference) getSwitchToOperational().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteToFailed() {
		if (routeToFailedEClass == null) {
			routeToFailedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(StochasticpetrinetPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return routeToFailedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteToFailed_Source() {
		return (EReference) getRouteToFailed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteToFailed_Target() {
		return (EReference) getRouteToFailed().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailwayContainerToPetriNet() {
		if (railwayContainerToPetriNetEClass == null) {
			railwayContainerToPetriNetEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(StochasticpetrinetPackage.eNS_URI).getEClassifiers().get(9);
		}
		return railwayContainerToPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayContainerToPetriNet_Source() {
		return (EReference) getRailwayContainerToPetriNet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayContainerToPetriNet_Target() {
		return (EReference) getRailwayContainerToPetriNet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticpetrinetFactory getStochasticpetrinetFactory() {
		return (StochasticpetrinetFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName(
					"hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //StochasticpetrinetPackageImpl
