package main;

public class Main {

	public static void main(String[] args) {
		
		int i;
		int[] numeros = new int[5];
		int[] numerosTres = new int[5];

		for(i = 0; i < numeros.length; i++) {
			numeros[i] = 1;
			numerosTres[i] = 1;
		}
		
		cambiarADosPorReferencia(numeros);
		
		System.out.println("Muestra el array pasado por referencia");
		
		for(i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}
		
		numerosTres = cambiarATresPorReturn(numeros);
		
		System.out.println("Muestra el array devuelto por return");
		
		for(i = 0; i < numerosTres.length; i++) {
			System.out.println("numeros[" + i + "] = " + numerosTres[i]);
		}

	}
	
	public static void cambiarADosPorReferencia(int[] numeros) {
		
		int i;
		
		for(i = 0; i < numeros.length; i++) {
			numeros[i] = 2;
		}
	}
	
	public static int[] cambiarATresPorReturn(int[] numeros) {
		
		int i;
		
		for(i = 0; i < numeros.length; i++) {
			numeros[i] = 3;
		}
		
		return numeros;
	}
	
	
	
	

}
