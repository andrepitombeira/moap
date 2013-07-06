package arida.ufc.br.function;

public class CostLinearFunction {
	
	private double coeficienteAngular;
	
	private double coeficienteLinear;
	
	//TODO
	public int calculate(int entry) {
		return 0;
	}
	
	public void generateFunction(int x1, int x2, int y1, int y2) {
		coeficienteAngular = deriveCoeficienteAngular(x1, x2, y1, y2);
		coeficienteLinear = deriveCoeficienteLinear(x1, y1);	
	}
	
	public double getCoeficienteAngular() {
		return coeficienteAngular;
	}

	public double getCoeficienteLinear() {
		return coeficienteLinear;
	}

	private double deriveCoeficienteAngular(int x1, int x2, int y1, int y2) {
		return (y2 - y1) / (x2 - x1);
	}
	
	private double deriveCoeficienteLinear(int x1, int y1) {
		return -coeficienteAngular * x1 + y1;
	}
}
