package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.ConnectRequiredElementQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreatePetriNetQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreateRouteQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreateSemaphoreQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreateSensorQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.CreateSwitchQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.FailedRouteQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.FailedSemaphoreQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.FailedSwitchQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.OperationalRouteQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.OperationalSemaphoreQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.OperationalSwitchQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwayContainerQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwaySemaphoreQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwaySensorQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwaySwitchQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteFollowsSwitchQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteQuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteRequiresSensor2QuerySpecification;
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteSignalsSemaphoreQuerySpecification;
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
    			.setPreconditionPattern(RailwaySwitchQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("_<1>")
    			.addVariable("_<2>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwaySwitch<rule>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwaySwitchQuerySpecification.instance(), "Container", "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateSwitchQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "_<1>"), LookupVariableReference.of("<rule>", "_<2>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwaySwitch<lookup0>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwaySwitchQuerySpecification.instance(), "Container", "_"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayContainerQuerySpecification.instance(), "Container"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("_")
    			.setPrecondition(MatchPreconditionSpecification.of(RailwaySwitchQuerySpecification.instance(), "Container", "_"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayContainerQuerySpecification.instance(), "Container"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(FailedSwitchQuerySpecification.instance())
    			.addVariable("Failed")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedSwitch<rule>")
    			.addParameter("Container")
    			.addParameter("Switch")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedSwitchQuerySpecification.instance(), "Container", "Switch"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Failed")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedSwitch<lookup0>")
    			.addParameter("Container")
    			.addParameter("Switch")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedSwitchQuerySpecification.instance(), "Container", "Switch"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwaySwitchQuerySpecification.instance(), "Container", "Switch"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Failed"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Switch")
    			.setPrecondition(MatchPreconditionSpecification.of(FailedSwitchQuerySpecification.instance(), "Container", "Switch"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwaySwitchQuerySpecification.instance(), "Container", "Switch"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(OperationalSwitchQuerySpecification.instance())
    			.addVariable("Operational")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalSwitch<rule>")
    			.addParameter("Container")
    			.addParameter("Switch")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalSwitchQuerySpecification.instance(), "Container", "Switch"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Operational")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalSwitch<lookup0>")
    			.addParameter("Container")
    			.addParameter("Switch")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalSwitchQuerySpecification.instance(), "Container", "Switch"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwaySwitchQuerySpecification.instance(), "Container", "Switch"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Operational"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Switch")
    			.setPrecondition(MatchPreconditionSpecification.of(OperationalSwitchQuerySpecification.instance(), "Container", "Switch"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwaySwitchQuerySpecification.instance(), "Container", "Switch"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RouteFollowsSwitchQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("SwitchUp")
    			.addVariable("SwitchDown")
    			.addVariable("RouteUp")
    			.addVariable("RouteDown")
    			.addVariable("RouteRepair")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeFollowsSwitch<rule>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Switch")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteFollowsSwitchQuerySpecification.instance(), "Container", "Route", "Switch"))
    			.addConstraint(TemplateConstraintSpecification.of(ConnectRequiredElementQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "SwitchUp"), LookupVariableReference.of("<rule>", "SwitchDown"), LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<rule>", "RouteRepair")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeFollowsSwitch<lookup0>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Switch")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteFollowsSwitchQuerySpecification.instance(), "Container", "Route", "Switch"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwaySwitchQuerySpecification.instance(), "Container", "Switch"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "Net")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "SwitchUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "SwitchDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeFollowsSwitch<lookup1>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Switch")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteFollowsSwitchQuerySpecification.instance(), "Container", "Route", "Switch"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RouteQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteRepair"), LookupVariableReference.of("<lookup>", "_<3>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Switch")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteFollowsSwitchQuerySpecification.instance(), "Container", "Route", "Switch"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwaySwitchQuerySpecification.instance(), "Container", "Switch"))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Switch")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteFollowsSwitchQuerySpecification.instance(), "Container", "Route", "Switch"))
    			.setConsequence(MatchPreconditionSpecification.of(RouteQuerySpecification.instance(), "Container", "Route"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RailwaySemaphoreQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("_<1>")
    			.addVariable("_<2>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwaySemaphore<rule>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwaySemaphoreQuerySpecification.instance(), "Container", "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateSemaphoreQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "_<1>"), LookupVariableReference.of("<rule>", "_<2>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwaySemaphore<lookup0>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwaySemaphoreQuerySpecification.instance(), "Container", "_"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayContainerQuerySpecification.instance(), "Container"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("_")
    			.setPrecondition(MatchPreconditionSpecification.of(RailwaySemaphoreQuerySpecification.instance(), "Container", "_"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayContainerQuerySpecification.instance(), "Container"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(FailedSemaphoreQuerySpecification.instance())
    			.addVariable("Failed")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedSemaphore<rule>")
    			.addParameter("Container")
    			.addParameter("Semaphore")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedSemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Failed")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.failedSemaphore<lookup0>")
    			.addParameter("Container")
    			.addParameter("Semaphore")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", FailedSemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwaySemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Failed"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Semaphore")
    			.setPrecondition(MatchPreconditionSpecification.of(FailedSemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwaySemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(OperationalSemaphoreQuerySpecification.instance())
    			.addVariable("Operational")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalSemaphore<rule>")
    			.addParameter("Container")
    			.addParameter("Semaphore")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalSemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.addConstraint(TemplateConstraintSpecification.of(SetInitialMarkingQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Operational")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.operationalSemaphore<lookup0>")
    			.addParameter("Container")
    			.addParameter("Semaphore")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", OperationalSemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwaySemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Operational"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Semaphore")
    			.setPrecondition(MatchPreconditionSpecification.of(OperationalSemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwaySemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RouteSignalsSemaphoreQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("SemaphoreUp")
    			.addVariable("SemaphoreDown")
    			.addVariable("RouteUp")
    			.addVariable("RouteDown")
    			.addVariable("RouteRepair")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeSignalsSemaphore<rule>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Semaphore")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteSignalsSemaphoreQuerySpecification.instance(), "Container", "Route", "Semaphore"))
    			.addConstraint(TemplateConstraintSpecification.of(ConnectRequiredElementQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "SemaphoreUp"), LookupVariableReference.of("<rule>", "SemaphoreDown"), LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<rule>", "RouteRepair")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeSignalsSemaphore<lookup0>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Semaphore")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteSignalsSemaphoreQuerySpecification.instance(), "Container", "Route", "Semaphore"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwaySemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "Net")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "SemaphoreUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "SemaphoreDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeSignalsSemaphore<lookup1>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Semaphore")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteSignalsSemaphoreQuerySpecification.instance(), "Container", "Route", "Semaphore"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RouteQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteRepair"), LookupVariableReference.of("<lookup>", "_<3>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Semaphore")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteSignalsSemaphoreQuerySpecification.instance(), "Container", "Route", "Semaphore"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwaySemaphoreQuerySpecification.instance(), "Container", "Semaphore"))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Semaphore")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteSignalsSemaphoreQuerySpecification.instance(), "Container", "Route", "Semaphore"))
    			.setConsequence(MatchPreconditionSpecification.of(RouteQuerySpecification.instance(), "Container", "Route"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RailwaySensorQuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("_<1>")
    			.addVariable("_<2>")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwaySensor<rule>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwaySensorQuerySpecification.instance(), "Container", "_"))
    			.addConstraint(TemplateConstraintSpecification.of(CreateSensorQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "_<1>"), LookupVariableReference.of("<rule>", "_<2>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.railwaySensor<lookup0>")
    			.addParameter("Container")
    			.addParameter("_")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RailwaySensorQuerySpecification.instance(), "Container", "_"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwayContainerQuerySpecification.instance(), "Container"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "_<1>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("_")
    			.setPrecondition(MatchPreconditionSpecification.of(RailwaySensorQuerySpecification.instance(), "Container", "_"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwayContainerQuerySpecification.instance(), "Container"))
    		)
    		.addVariableInstantiationRuleOrThrow(b -> b
    			.setPreconditionPattern(RouteRequiresSensor2QuerySpecification.instance())
    			.addVariable("Net")
    			.addVariable("SensorUp")
    			.addVariable("SensorDown")
    			.addVariable("RouteUp")
    			.addVariable("RouteDown")
    			.addVariable("RouteRepair")
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeRequiresSensor2<rule>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Sensor")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteRequiresSensor2QuerySpecification.instance(), "Container", "Route", "Sensor"))
    			.addConstraint(TemplateConstraintSpecification.of(ConnectRequiredElementQuerySpecification.instance(), LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<rule>", "SensorUp"), LookupVariableReference.of("<rule>", "SensorDown"), LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<rule>", "RouteRepair")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeRequiresSensor2<lookup0>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Sensor")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteRequiresSensor2QuerySpecification.instance(), "Container", "Route", "Sensor"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RouteQuerySpecification.instance(), "Container", "Route"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "Net"), LookupVariableReference.of("<lookup>", "Net")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "RouteRepair"), LookupVariableReference.of("<lookup>", "_<3>")))
    		)
    		.addConstraintRuleOrThrow(b -> b
    			.setName("hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.routeRequiresSensor2<lookup1>")
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Sensor")
    			.addPrecondition(LookupPreconditionSpecification.of("<rule>", RouteRequiresSensor2QuerySpecification.instance(), "Container", "Route", "Sensor"))
    			.addPrecondition(LookupPreconditionSpecification.of("<lookup>", RailwaySensorQuerySpecification.instance(), "Container", "Sensor"))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "SensorUp"), LookupVariableReference.of("<lookup>", "_<1>")))
    			.addConstraint(EquivalenceConstraintSpecification.of(LookupVariableReference.of("<rule>", "SensorDown"), LookupVariableReference.of("<lookup>", "_<2>")))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Sensor")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteRequiresSensor2QuerySpecification.instance(), "Container", "Route", "Sensor"))
    			.setConsequence(MatchPreconditionSpecification.of(RouteQuerySpecification.instance(), "Container", "Route"))
    		)
    		.addDependencyRuleOrThrow(b -> b
    			.addParameter("Container")
    			.addParameter("Route")
    			.addParameter("Sensor")
    			.setPrecondition(MatchPreconditionSpecification.of(RouteRequiresSensor2QuerySpecification.instance(), "Container", "Route", "Sensor"))
    			.setConsequence(MatchPreconditionSpecification.of(RailwaySensorQuerySpecification.instance(), "Container", "Sensor"))
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
