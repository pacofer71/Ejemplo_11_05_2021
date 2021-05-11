package paquete1;

public class Cuadrado {
	double lado;
	
	public Cuadrado() {};
	public Cuadrado(double miLado) {
		lado=miLado;
	}
	/**
	 * @return double
	 */
	public double calculaPerimetro() {
		return 4*lado;
	}
	public double calcularArea() {
		return lado*lado;
	}
}