package main;

public class Main {

	public static void main(String[] args) { 
		
		Wrapper objeto = new Wrapper();
		objeto.x = 5;
		int x = 5;
		
		sumaUnoPorReferencia(objeto);
		sumaUnoNormal(x);
		
		System.out.println("El valor del objeto es: " + objeto.x);
		System.out.println("El valor del entero es: " + x);
	}
	
	public static void sumaUnoPorReferencia(Wrapper objeto) {
		objeto.x++;
	}
	
	public static void sumaUnoNormal(int x) {
		x++;
	}
	
}
