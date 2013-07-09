package arida.ufc.br.model;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import ac.essex.graphing.plotting.Graph;
import ac.essex.graphing.swing.GraphApplication;
import arida.ufc.br.function.CostLinearFunction;
import arida.ufc.br.function.EdgeContinuousFunctionPlotter;
import arida.ufc.viewer.PlotCostLinearFunctionSetting;

public class Edge {
	
	private final Vertice source;
	
	private final Vertice destiny;
	
	private String label;
	
	private final Set<CostLinearFunction> functions;
	
	public Edge(Vertice source, Vertice destiny) {
		this.source = source;
		this.destiny = destiny;	
		this.functions = new HashSet<CostLinearFunction>();
	}

	public Vertice getSource() {
		return source;
	}

	public Vertice getDestiny() {
		return destiny;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public void addFunction(CostLinearFunction function) {
		functions.add(function);
	}
	
	public Set<CostLinearFunction> getFunctions() {
		return functions;
	}

	public boolean equals(Edge edge) {
		if(edge.getSource().equals(this.getSource()) && edge.getDestiny().equals(this.getDestiny())) {
			return true;
		}
		return false;
	}
	
	public void plotFunctions(PlotCostLinearFunctionSetting p){
		Graph graph = new Graph(p); 
		EdgeContinuousFunctionPlotter plotter = new EdgeContinuousFunctionPlotter("Edge: " + label, functions);
		graph.functions.add(plotter);
		new GraphApplication(graph);
	}
	
	public static void main(String[] args) {
		Vertice source = new Vertice(1, 2);
		Vertice destiny = new Vertice(3, 4);
		Edge e = new Edge(source, destiny);
		e.addFunction(new CostLinearFunction(0,30,10,30,"f1"));
		e.addFunction(new CostLinearFunction(10,30,14,40,"f2"));
		e.addFunction(new CostLinearFunction(14,40,16,50,"f3"));
		e.addFunction(new CostLinearFunction(16,50,20,50,"f4"));
		e.addFunction(new CostLinearFunction(20,50,24,30,"f5"));
		e.plotFunctions(new PlotCostLinearFunctionSetting(0, 24, 25, 55, Color.red, "Custo B,C", 5,5));
		
	}
}
