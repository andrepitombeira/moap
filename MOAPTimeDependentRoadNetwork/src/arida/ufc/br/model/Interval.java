package arida.ufc.br.model;

import java.awt.Color;

import arida.ufc.br.function.CostLinearFunction;
import arida.ufc.viewer.PlotCostLinearFunctionSetting;

public class Interval implements Comparable<Interval>{
	
	private double start;
	
	private double end;
	
	private CostLinearFunction cost;
	
	public Interval(double start, double end, CostLinearFunction cost) {
		this(start,end);
		this.cost = cost;
	}

	public Interval(double start, double end) {
		super();
		if(start >= end){
			throw new RuntimeException("Start must be lower than end.");
		}
		this.start = start;
		this.end = end;
	}

	public double getStart() {
		return start;
	}

	public double getEnd() {
		return end;
	}

	public CostLinearFunction getCost() {
		return cost;
	}

	public void setCost(CostLinearFunction cost) {
		this.cost = cost;
	}
	
	public void plot(PlotCostLinearFunctionSetting p){
		this.cost.plot(p);
	}
	

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		long temp;
		temp = Double.doubleToLongBits(end);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(start);
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
		Interval other = (Interval) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (Double.doubleToLongBits(end) != Double.doubleToLongBits(other.end))
			return false;
		if (Double.doubleToLongBits(start) != Double
				.doubleToLongBits(other.start))
			return false;
		return true;
	}

	@Override
	public int compareTo(Interval o) {
		return (int) (this.start - o.start);
	}
	
	public static void main(String[] args) {
		Interval i = new Interval(10,16);
		CostLinearFunction c = new CostLinearFunction(10, 20, 16, 15);
		i.setCost(c);
		i.plot(new PlotCostLinearFunctionSetting(0, 16, 14, 20, Color.red, "Intervalo 1", 5, 2));
	}


	
}
