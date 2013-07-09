package arida.ufc.br.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Edge {
	
	private final Vertice source;
	
	private final Vertice destiny;
	
	private String label;
	
	private final Set<Interval> intervals;
	
	public Edge(Vertice source, Vertice destiny) {
		this.source = source;
		this.destiny = destiny;	
		this.intervals = new HashSet<Interval>();
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
	
	public Set<Interval> getIntervals() {
		return intervals;
	}
	
	public void addInterval(Interval interval) {
		intervals.add(interval);
	}
	
	public boolean equals(Edge edge) {
		if(edge.getSource().equals(this.getSource()) && edge.getDestiny().equals(this.getDestiny())) {
			return true;
		}
		return false;
	}
	
	public void plotIntervals(){
		Collections.sort(new ArrayList<Interval>(intervals));
	}
}
