package arida.ufc.br.function;

import ac.essex.graphing.plotting.ContinuousFunctionPlotter;
import ac.essex.graphing.plotting.Graph;
import ac.essex.graphing.swing.GraphApplication;
import arida.ufc.viewer.PlotCostLinearFunctionSetting;

public class CostLinearFunction {
	
	private double coeficienteAngular;
	
	private double coeficienteLinear;
	
	private String name;
	
	
	public CostLinearFunction(double coeficienteAngular,
			double coeficienteLinear) {
		super();
		this.coeficienteAngular = coeficienteAngular;
		this.coeficienteLinear = coeficienteLinear;
	}

	public CostLinearFunction(double x1, double y1, double x2, double y2){
		generateFunction(x1, y1, x2, y2);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double calculate(double input) {
		return coeficienteAngular * input + coeficienteLinear;
	}
	
	public void generateFunction(double x1, double y1,double x2, double y2) {
		if(x1 != x2){
			coeficienteAngular = deriveCoeficienteAngular(x1, x2, y1, y2);
			coeficienteLinear = deriveCoeficienteLinear(x1, y1);	
		}
		else
			throw new RuntimeException("Invalid points x1 = x2");
			
	}
	
	public double getCoeficienteAngular() {
		return coeficienteAngular;
	}

	public double getCoeficienteLinear() {
		return coeficienteLinear;
	}

	private double deriveCoeficienteAngular(double x1, double x2, double y1, double y2) {
		return (double) (y2 - y1) / (x2 - x1);
	}
	
	private double deriveCoeficienteLinear(double x1, double y1) {
		return -coeficienteAngular * x1 + y1;
	}
	
	@Override
	public String toString() {
		return "Linear function: f(x) = " + coeficienteAngular + "* x + " + coeficienteLinear;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(coeficienteAngular);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(coeficienteLinear);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CostLinearFunction other = (CostLinearFunction) obj;
		if (Double.doubleToLongBits(coeficienteAngular) != Double
				.doubleToLongBits(other.coeficienteAngular))
			return false;
		if (Double.doubleToLongBits(coeficienteLinear) != Double
				.doubleToLongBits(other.coeficienteLinear))
			return false;
		return true;
	}

	public Graph getGraph(PlotCostLinearFunctionSetting p){
		Graph graph = new Graph(p); 
		ContinuousFunctionPlotter plotter = new ContinuousFunctionPlotter() {
			
			@Override
			public String getName() {
				return name;
			}
			
			@Override
			public double getY(double x) {
				return calculate(x);
			}
		};
		graph.functions.add(plotter);
		return graph;
	}
	
	public void plot(PlotCostLinearFunctionSetting p){
		new GraphApplication(getGraph(p));
	}
	
	public static void main(String[] args) {
		CostLinearFunction function = new CostLinearFunction(1,2,3,5);
		System.out.println(function);
	}
}
