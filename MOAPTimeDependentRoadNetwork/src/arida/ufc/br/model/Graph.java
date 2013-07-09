package arida.ufc.br.model;

import java.util.HashSet;
import java.util.Set;

import arida.ufc.br.function.CostLinearFunction;

public class Graph {
	
	protected final Set<Vertice> vertices;
	
	protected final Set<Edge> edges;
	
	protected final Set<CostLinearFunction> functions;
	
	public Graph() {
		this.vertices = new HashSet<Vertice>();
		this.edges = new HashSet<Edge>();
		this.functions = new HashSet<CostLinearFunction>();
	}
	
	public void addFunction(CostLinearFunction function) {
		functions.add(function);
	}
	
	public void addVertice(Vertice vertice) {
		vertices.add(vertice);
	}
	
	public void addEdge(Vertice source, Vertice destiny) {
		Edge edge = new Edge(source, destiny);
		source.addEdge(edge);
		edges.add(edge);
	}
}
