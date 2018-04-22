package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.dependability;

import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.CreateErrorModelInterfaceQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.CreateErrorModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.CreateFailureRepairModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.CreateImmediateRepairModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.ErrorModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.FailedRailwayElementQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.FailureRepairModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.ImmediateRepairModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.OperationalRailwayElementQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.RailwayElementFailureModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.RailwayElementQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.ConnectRequiredElementQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreatePetriNetQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwayContainerQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteRequiresElementQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.SetInitialMarkingQuerySpecification;
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
public final class Dependability2PetriNet {
  private Dependability2PetriNet() {
    throw new IllegalArgumentException("This class should not be instantiated directly. Use the #create() static method instead.");
  }
  
  public static ViewSpecification<IQuerySpecification<?>, IQuerySpecification<?>> createSpecification() throws ViatraQueryException {
    return ViewSpecification.createOrThrow(b0 -> b0
    		.addRequiredMetamodel("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/railway.ecore")
    		.addRequiredMetamodel("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/stochasticpetrinet.ecore")
    		.addRequiredMetamodel("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/dependability.ecore")
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RailwayContainerQuerySpecification.instance())
    			.addVariable("_<1>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwayContainer<rule>")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwayContainerQuerySpecification.instance(), "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreatePetriNetQuerySpecification.instance(), LookupVariableReference.of("<rule>", "_<1>")))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RailwayElementQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("_<1>")
    			.addVariable("_<2>")
    			.addVariable("_<3>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.railwayElement<rule>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwayElementQuerySpecification.instance(), "Container", "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateErrorModelInterfaceQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "_<1>"), LookupVariableReference.of("<rule>", "_<2>"), LookupVariableReference.of("<rule>", "_<3>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.railwayElement<lookup0>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwayElementQuerySpecification.instance(), "Container", "_"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayContainerQuerySpecification.instance(), "Container"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("_")
    			.setPrecondition(MatchPreconditionSpecification.of(RailwayElementQuerySpecification.instance(), "Container", "_"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayContainerQuerySpecification.instance(), "Container"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(FailedRailwayElementQuerySpecification.instance())
    			.addVariable("Down")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.failedRailwayElement<rule>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedRailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Down")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.failedRailwayElement<lookup0>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedRailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Down"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(FailedRailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementQuerySpecification.instance(), "Container", "Element"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(OperationalRailwayElementQuerySpecification.instance())
    			.addVariable("Up")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.operationalRailwayElement<rule>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalRailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Up")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.operationalRailwayElement<lookup0>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalRailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Up"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(OperationalRailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementQuerySpecification.instance(), "Container", "Element"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RouteRequiresElementQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("ElementUp")
    			.addVariable("ElementDown")
    			.addVariable("RouteUp")
    			.addVariable("RouteDown")
    			.addVariable("RouteRepair")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeRequiresElement<rule>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteRequiresElementQuerySpecification.instance(), "Container", "Route", "Element"))
    			.addConstraint(TemplateConstraintSpecification.of(ConnectRequiredElementQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "ElementUp"), LookupVariableReference.of("<rule>", "ElementDown"), LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<rule>", "RouteRepair")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeRequiresElement<lookup0>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteRequiresElementQuerySpecification.instance(), "Container", "Route", "Element"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "Net")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteRepair"), LookupVariableReference.of("<lookup>", "_<3>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeRequiresElement<lookup1>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteRequiresElementQuerySpecification.instance(), "Container", "Route", "Element"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "ElementUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "ElementDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteRequiresElementQuerySpecification.instance(), "Container", "Route", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementQuerySpecification.instance(), "Container", "Route"))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteRequiresElementQuerySpecification.instance(), "Container", "Route", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementQuerySpecification.instance(), "Container", "Element"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(ErrorModelQuerySpecification.instance())
    			.addVariable("_<1>")
    			.addVariable("_<2>")
    			.addVariable("_<3>")
    			.addVariable("_<4>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.errorModel<rule>")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", ErrorModelQuerySpecification.instance(), "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateErrorModelQuerySpecification.instance(), LookupVariableReference.of("<rule>", "_<1>"), LookupVariableReference.of("<rule>", "_<2>"), LookupVariableReference.of("<rule>", "_<3>"), LookupVariableReference.of("<rule>", "_<4>")))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(FailureRepairModelQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("Up")
    			.addVariable("Down")
    			.addVariable("Repair")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.failureRepairModel<rule>")
    			.addParameter("Model")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailureRepairModelQuerySpecification.instance(), "Model"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateFailureRepairModelQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "Up"), LookupVariableReference.of("<rule>", "Down"), LookupVariableReference.of("<rule>", "Repair")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.failureRepairModel<lookup0>")
    			.addParameter("Model")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailureRepairModelQuerySpecification.instance(), "Model"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", ErrorModelQuerySpecification.instance(), "Model"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Up"), LookupVariableReference.of("<lookup>", "_<2>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Down"), LookupVariableReference.of("<lookup>", "_<3>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Repair"), LookupVariableReference.of("<lookup>", "_<4>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Model")
    			.setPrecondition(MatchPreconditionSpecification.of(FailureRepairModelQuerySpecification.instance(), "Model"))
    			.setConsequence(MatchPreconditionSpecification.of(ErrorModelQuerySpecification.instance(), "Model"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(ImmediateRepairModelQuerySpecification.instance())
    			.addVariable("Repair")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.immediateRepairModel<rule>")
    			.addParameter("Model")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", ImmediateRepairModelQuerySpecification.instance(), "Model"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateImmediateRepairModelQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Repair")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.immediateRepairModel<lookup0>")
    			.addParameter("Model")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", ImmediateRepairModelQuerySpecification.instance(), "Model"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", ErrorModelQuerySpecification.instance(), "Model"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Repair"), LookupVariableReference.of("<lookup>", "_<4>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Model")
    			.setPrecondition(MatchPreconditionSpecification.of(ImmediateRepairModelQuerySpecification.instance(), "Model"))
    			.setConsequence(MatchPreconditionSpecification.of(ErrorModelQuerySpecification.instance(), "Model"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RailwayElementFailureModelQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("Up")
    			.addVariable("Down")
    			.addVariable("Repair")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.railwayElementFailureModel<lookup0>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addParameter("Model")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwayElementFailureModelQuerySpecification.instance(), "Container", "Element", "Model"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "Net")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Up"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Down"), LookupVariableReference.of("<lookup>", "_<2>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Repair"), LookupVariableReference.of("<lookup>", "_<3>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.railwayElementFailureModel<lookup1>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addParameter("Model")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwayElementFailureModelQuerySpecification.instance(), "Container", "Element", "Model"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", ErrorModelQuerySpecification.instance(), "Model"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Up"), LookupVariableReference.of("<lookup>", "_<2>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Down"), LookupVariableReference.of("<lookup>", "_<3>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Repair"), LookupVariableReference.of("<lookup>", "_<4>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Element")
    			.addParameter("Model")
    			.setPrecondition(MatchPreconditionSpecification.of(RailwayElementFailureModelQuerySpecification.instance(), "Container", "Element", "Model"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementQuerySpecification.instance(), "Container", "Element"))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Element")
    			.addParameter("Model")
    			.setPrecondition(MatchPreconditionSpecification.of(RailwayElementFailureModelQuerySpecification.instance(), "Container", "Element", "Model"))
    			.setConsequence(MatchPreconditionSpecification.of(ErrorModelQuerySpecification.instance(), "Model"))
    		)
    	);
  }
  
  public static ViewModel create(final ViatraQueryEngine queryEngine) throws ViatraQueryException {
    return ViewModel.create(queryEngine, Dependability2PetriNet.createSpecification());
  }
  
  public static ViewModel create(final Notifier notifier) throws ViatraQueryException {
    return ViewModel.create(notifier, Dependability2PetriNet.createSpecification());
  }
}
