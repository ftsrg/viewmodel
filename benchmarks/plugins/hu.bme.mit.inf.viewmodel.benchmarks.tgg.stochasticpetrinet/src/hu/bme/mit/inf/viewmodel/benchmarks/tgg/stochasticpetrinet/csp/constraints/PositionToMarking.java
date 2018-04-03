package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.csp.constraints;

import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position;

public class PositionToMarking extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1, Variable var_2) {
		if (!var_0.isBound()) {
			String bindingStates = getBindingStates(var_0, var_1, var_2);
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
		Position position = (Position) var_0.getValue();
		switch (position) {
		case STRAIGHT:
		case DIVERGING:
			setSatisfied(checkOrSet(var_1, 1) && checkOrSet(var_2, 0));
			break;
		case FAILURE:
			setSatisfied(checkOrSet(var_1, 0) && checkOrSet(var_2, 1));
			break;
		default:
			setSatisfied(false);
			break;
		}
	}
	
	private boolean checkOrSet(Variable var, int value) {
		if (var.isBound()) {
			int currentValue = (Integer) var.getValue();
			return currentValue == value;
		} else {
			var.bindToValue(value);
			return true;
		}
	}
}