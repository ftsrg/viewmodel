package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.ConnectRequiredElementQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreateFailureModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreatePetriNetQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreateRouteQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.FailedRailwayElementWithFailureModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.FailedRouteQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.OperationalRailwayElementWithFailureModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.OperationalRouteQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwayContainerQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwayElementWithFailureModelQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteQuerySpecification;
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
public final class TrainBenchmark2PetriNet {
  private TrainBenchmark2PetriNet() {
    throw new IllegalArgumentException("This class should not be instantiated directly. Use the #create() static method instead.");
  }
  
  public static ViewSpecification<IQuerySpecification<?>, IQuerySpecification<?>> createSpecification() throws ViatraQueryException {
    return ViewSpecification.createOrThrow(b0 -> b0
    		.addRequiredMetamodel("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/railway.ecore")
    		.addRequiredMetamodel("platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/stochasticpetrinet.ecore")
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
    			.setPreconditionPattern(RouteQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("_<1>")
    			.addVariable("_<2>")
    			.addVariable("_<3>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.route<rule>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteQuerySpecification.instance(), "Container", "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateRouteQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "_<1>"), LookupVariableReference.of("<rule>", "_<2>"), LookupVariableReference.of("<rule>", "_<3>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.route<lookup0>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteQuerySpecification.instance(), "Container", "_"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayContainerQuerySpecification.instance(), "Container"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("_")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteQuerySpecification.instance(), "Container", "_"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayContainerQuerySpecification.instance(), "Container"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(FailedRouteQuerySpecification.instance())
    			.addVariable("Failed")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedRoute<rule>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedRouteQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Failed")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedRoute<lookup0>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedRouteQuerySpecification.instance(), "Container", "Route"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RouteQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Failed"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.setPrecondition(MatchPreconditionSpecification.of(FailedRouteQuerySpecification.instance(), "Container", "Route"))
    			.setConsequence(MatchPreconditionSpecification.of(RouteQuerySpecification.instance(), "Container", "Route"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(OperationalRouteQuerySpecification.instance())
    			.addVariable("Operational")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalRoute<rule>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalRouteQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Operational")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalRoute<lookup0>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalRouteQuerySpecification.instance(), "Container", "Route"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RouteQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Operational"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.setPrecondition(MatchPreconditionSpecification.of(OperationalRouteQuerySpecification.instance(), "Container", "Route"))
    			.setConsequence(MatchPreconditionSpecification.of(RouteQuerySpecification.instance(), "Container", "Route"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RailwayElementWithFailureModelQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("_<1>")
    			.addVariable("_<2>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwayElementWithFailureModel<rule>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateFailureModelQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "_<1>"), LookupVariableReference.of("<rule>", "_<2>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwayElementWithFailureModel<lookup0>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "_"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayContainerQuerySpecification.instance(), "Container"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("_")
    			.setPrecondition(MatchPreconditionSpecification.of(RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "_"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayContainerQuerySpecification.instance(), "Container"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(FailedRailwayElementWithFailureModelQuerySpecification.instance())
    			.addVariable("Failed")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedRailwayElementWithFailureModel<rule>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedRailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Failed")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedRailwayElementWithFailureModel<lookup0>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedRailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Failed"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(FailedRailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(OperationalRailwayElementWithFailureModelQuerySpecification.instance())
    			.addVariable("Operational")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalRailwayElementWithFailureModel<rule>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalRailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Operational")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalRailwayElementWithFailureModel<lookup0>")
    			.addParameter("Container")
    			.addParameter("Element")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalRailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Operational"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(OperationalRailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
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
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RouteQuerySpecification.instance(), "Container", "Route"))
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
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "ElementUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "ElementDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteRequiresElementQuerySpecification.instance(), "Container", "Route", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RouteQuerySpecification.instance(), "Container", "Route"))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Element")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteRequiresElementQuerySpecification.instance(), "Container", "Route", "Element"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayElementWithFailureModelQuerySpecification.instance(), "Container", "Element"))
    		)
    	);
  }
  
  public static ViewModel create(final ViatraQueryEngine queryEngine) throws ViatraQueryException {
    return ViewModel.create(queryEngine, TrainBenchmark2PetriNet.createSpecification());
  }
  
  public static ViewModel create(final Notifier notifier) throws ViatraQueryException {
    return ViewModel.create(notifier, TrainBenchmark2PetriNet.createSpecification());
  }
}
