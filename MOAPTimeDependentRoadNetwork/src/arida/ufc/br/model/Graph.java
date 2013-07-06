package arida.ufc.br.model;

import java.util.HashSet;
import java.util.Set;

public class Graph {
	
	protected final Set<Vertice> vertices;
	
	protected final Set<Edge> edges;
	
	public Graph() {
		this.vertices = new HashSet<Vertice>();
		this.edges = new HashSet<Edge>();
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
