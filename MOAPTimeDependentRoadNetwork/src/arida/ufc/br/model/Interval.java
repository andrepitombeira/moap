package arida.ufc.br.model;

import arida.ufc.br.function.CostLinearFunction;

public class Interval {
	
	private int start;
	
	private int end;
	
	private CostLinearFunction cost;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public CostLinearFunction getCost() {
		return cost;
	}

	public void setCost(CostLinearFunction cost) {
		this.cost = cost;
	}
}
