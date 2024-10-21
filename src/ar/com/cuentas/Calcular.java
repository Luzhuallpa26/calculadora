package ar.com.cuentas;

public class Calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcular calculadora = new Calcular ();
		calculadora.suma(2, 2);
		calculadora.resta(3, 1);
		calculadora.division(4, 2);
		calculadora.multiplicacion(5, 2);
		
		System.out.println("calculadora.suma(2, 2)");
		System.out.println("calculadora.resta()");

	}
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	public int resta(int a, int b) {
		return a - b;
	}
	public int division(int a, int b) {
		return a / b;
		
	}
	public int multiplicacion(int a, int b) {
		return a * b;
	}
	
	

}
