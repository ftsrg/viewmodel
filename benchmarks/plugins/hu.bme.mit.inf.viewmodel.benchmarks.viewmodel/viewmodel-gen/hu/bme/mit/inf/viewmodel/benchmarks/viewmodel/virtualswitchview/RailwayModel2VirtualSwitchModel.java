package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.virtualswitchview;

import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.ConnectVirtualSwitchesQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.ConnectedToQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.CountConnectedInFailureQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.CreateVirtualSwitchQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.SetConnectedSwitchesInFailureCountQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.VirtualSwitchesQuerySpecification;
import hu.bme.mit.inf.viewmodel.runtime.specification.AssignmentConstraintSpecification;
import hu.bme.mit.inf.viewmodel.runtime.specification.EquivalenceConstraintSpecification;
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupPreconditionSpecification;
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupVariableReference;
import hu.bme.mit.inf.viewmodel.runtime.specification.MatchPreconditionSpecification;
import hu.bme.mit.inf.viewmodel.runtime.specification.TemplateConstraintSpecification;
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification;
import hu.bme.mit.inf.viewmodel.runtime.transformation.ViewModel;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

@SuppressWarnings("all")
public final class RailwayModel2VirtualSwitchModel {
  private RailwayModel2VirtualSwitchModel() {
    throw new IllegalArgumentException("This class should not be instantiated directly. Use the #create() static method instead.");
  }
  
  public static ViewSpecification<IQuerySpecification<?>, IQuerySpecification<?>> createSpecification() throws ViatraQueryException {
    return ViewSpecification.createOrThrow(b0 -> b0
    		.addRequiredMetamodel("http://www.semanticweb.org/ontologies/2015/trainbenchmark")
    		.addRequiredMetamodel("http://inf.mit.bme.hu/emf/2018/viewmodel-benchmark-virtualswitchview")
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(VirtualSwitchesQuerySpecification.instance())
    			.addVariable("_<1>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.virtualSwitches<rule>")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", VirtualSwitchesQuerySpecification.instance(), "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateVirtualSwitchQuerySpecification.instance(), LookupVariableReference.of("<rule>", "_<1>")))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(ConnectedToQuerySpecification.instance())
    			.addVariable("VirtualLeft")
    			.addVariable("VirtualRight")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.connectedTo<rule>")
    			.addParameter("Left")
    			.addParameter("Right")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", ConnectedToQuerySpecification.instance(), "Left", "Right"))
    			.addConstraint(TemplateConstraintSpecification.of(ConnectVirtualSwitchesQuerySpecification.instance(), LookupVariableReference.of("<rule>", "VirtualLeft"), LookupVariableReference.of("<rule>", "VirtualRight")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.connectedTo<lookup0>")
    			.addParameter("Left")
    			.addParameter("Right")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", ConnectedToQuerySpecification.instance(), "Left", "Right"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", VirtualSwitchesQuerySpecification.instance(), "Left"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "VirtualLeft"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.connectedTo<lookup1>")
    			.addParameter("Left")
    			.addParameter("Right")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", ConnectedToQuerySpecification.instance(), "Left", "Right"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", VirtualSwitchesQuerySpecification.instance(), "Right"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "VirtualRight"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Left")
    			.addParameter("Right")
    			.setPrecondition(MatchPreconditionSpecification.of(ConnectedToQuerySpecification.instance(), "Left", "Right"))
    			.setConsequence(MatchPreconditionSpecification.of(VirtualSwitchesQuerySpecification.instance(), "Left"))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Left")
    			.addParameter("Right")
    			.setPrecondition(MatchPreconditionSpecification.of(ConnectedToQuerySpecification.instance(), "Left", "Right"))
    			.setConsequence(MatchPreconditionSpecification.of(VirtualSwitchesQuerySpecification.instance(), "Right"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(CountConnectedInFailureQuerySpecification.instance())
    			.addVariable("VirtualSwitch")
    			.addVariable("N")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.countConnectedInFailure<rule>")
    			.addParameter("Switch")
    			.addParameter("N")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", CountConnectedInFailureQuerySpecification.instance(), "Switch", "N"))
    			.addConstraint(AssignmentConstraintSpecification.of(LookupVariableReference.of("<rule>", "N"), "N"))
    			.addConstraint(TemplateConstraintSpecification.of(SetConnectedSwitchesInFailureCountQuerySpecification.instance(), LookupVariableReference.of("<rule>", "VirtualSwitch"), LookupVariableReference.of("<rule>", "N")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.countConnectedInFailure<lookup0>")
    			.addParameter("Switch")
    			.addParameter("N")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", CountConnectedInFailureQuerySpecification.instance(), "Switch", "N"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", VirtualSwitchesQuerySpecification.instance(), "Switch"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "VirtualSwitch"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Switch")
    			.addParameter("N")
    			.setPrecondition(MatchPreconditionSpecification.of(CountConnectedInFailureQuerySpecification.instance(), "Switch", "N"))
    			.setConsequence(MatchPreconditionSpecification.of(VirtualSwitchesQuerySpecification.instance(), "Switch"))
    		)
    	);
  }
  
  public static ViewModel create(final ViatraQueryEngine queryEngine) throws ViatraQueryException {
    return ViewModel.create(queryEngine, RailwayModel2VirtualSwitchModel.createSpecification());
  }
  
  public static ViewModel create(final Notifier notifier) throws ViatraQueryException {
    return ViewModel.create(notifier, RailwayModel2VirtualSwitchModel.createSpecification());
  }
}
