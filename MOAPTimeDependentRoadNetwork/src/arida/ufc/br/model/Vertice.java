package arida.ufc.br.model;

import java.util.HashSet;
import java.util.Set;

public class Vertice {

	private long id;
	
	private double x;
	
	private double y;
	
	private String label;
	
	private final Set<Edge> edges;
	
	private Vertice parent;
	
	public Vertice() {
		this.edges = new HashSet<Edge>();
	}
	
	public Vertice(long id, String label, double x, double y) {
		this.id = id;
		this.label = label;
		this.x = x;
		this.y = y;
		this.edges = new HashSet<Edge>();
	}
	
	public void addEdge(Edge edge) {
		edges.add(edge);
	}
	
	public long getId() {
		return id;
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
	
	public Vertice getParent() {
		return parent;
	}

	public void setParent(Vertice parent) {
		this.parent = parent;
	}
	
	public boolean equals(Vertice vertice) {
		if(vertice.getX() == this.getX() && vertice.getY() == this.getY()) {
			return true;
		}
		return false;
	}
}
