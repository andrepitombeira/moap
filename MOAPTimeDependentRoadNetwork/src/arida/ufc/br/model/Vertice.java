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
<<<<<<< HEAD
	
	public Vertice getParent() {
		return parent;
	}

	public void setParent(Vertice parent) {
		this.parent = parent;
	}
	
	public boolean equals(Vertice vertice) {
		if(vertice.getX() == this.getX() && vertice.getY() == this.getY()) {
=======

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
>>>>>>> 161eb6d831496b15a34c4f271052082f7d0f96ab
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertice other = (Vertice) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	
}
