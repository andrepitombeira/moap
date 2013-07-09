package arida.ufc.br.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import ac.essex.graphing.plotting.ContinuousFunctionPlotter;

public class EdgeContinuousFunctionPlotter extends ContinuousFunctionPlotter{
	private String name;
	private List<CostLinearFunction> functions;
	
	public EdgeContinuousFunctionPlotter(String name, Set<CostLinearFunction> functions){
		this.name = name;
		this.functions = new ArrayList<CostLinearFunction>(functions);
		Collections.sort(this.functions);
	}
	
	
	@Override
	public double getY(double x) {
		for(CostLinearFunction function : functions){
			if (x >= function.getxInitial() && (x <= function.getxFinal())){
				return function.calculate(x);
			}
		}
		return Double.MAX_VALUE;
	}

	@Override
	public String getName() {
		return name;
	}

}
