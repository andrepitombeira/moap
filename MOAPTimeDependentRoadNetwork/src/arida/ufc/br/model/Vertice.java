package arida.ufc.br.model;

import java.util.HashSet;
import java.util.Set;

public class Vertice {

	private double x;
	
	private double y;
	
	private String label;
	
	private final Set<Edge> edges;
	
	public Vertice(double x, double y) {
		this.x = x;
		this.y = y;
		this.edges = new HashSet<Edge>();
	}
	
	public void addEdge(Edge edge) {
		edges.add(edge);
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public boolean equals(Vertice vertice) {
		if(vertice.getX() == this.getX() && vertice.getY() == this.getY()) {
			return true;
		}
		return false;
	}
}
