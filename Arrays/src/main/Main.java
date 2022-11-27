package main;

public class Main {

	public static void main(String[] args) {
		
		int i = 0;
		// Creamos una variable con 5 cajitas, en java por defecto es 0
		// pero siempre es recomendable inicializar todos los valores
		// [0|0|0|0|0}
		int[] numeros = new int[5];
		
		// Asignamos al hueco 1 el número 36
		// [0|36|0|0|0]
		numeros[1] = 36;
		
		//Recorremos todo el array para mostrarlo
		for(i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}
		
		// Ahora vamos a inicializar el array por el valor de i por 2
		// Nótese que los índices de los arrays comienzan por 0
		// Es decir si es 5 la logigitud serían 0, 1, 2, 3, 4
		// numeros[5] ya estaría fuera del rango de memoria reservada
		for(i = 0; i < numeros.length; i++) {
			numeros[i] = i * 2;
		}
		
		// Mostramos los valores
		for(i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}
		
		try {
			//Probamos que si el índice del array está fuera de rango da error
			System.out.println("numeros[" + i + "] = " + numeros[5]);
		} catch(Exception e) {
			System.err.println("Error de fuera de rango: \n" + e);
		}

	}

}
