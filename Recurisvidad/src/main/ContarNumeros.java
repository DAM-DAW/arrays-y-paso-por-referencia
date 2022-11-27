package main;

//Ejemplos de contar números desde 1 hasta n
public class ContarNumeros {
	
	// En este ejemplo tenemos el caso base n = 1
	// donde no se llamará de nuevo a la misma función
	// Y podrá continuar la iteración anterior
	// Notese que no devolvemos nada por return, el valor ya lo tiene n
	public void contarNumeros(int n) {
		
		if(n == 1) {
			// No hacer nada
		} else {
			contarNumeros(n - 1);
			
			System.out.println(n);
		}
	}
	
	// Este ejemplo funciona, se parece al factorial,
	// pero hacemos la cuenta del 1 al 10 2 veces
	// por lo que no es del todo eficiente, pero funciona
	public int contarNumeros2(int n) {
		
		int resultado = 0;
		
		if(n == 1) {
			resultado = 1;
		} else {
			resultado = 1 + contarNumeros2(n - 1);
			
		}
		
		System.out.println(resultado);	

		return resultado;

	}
}
