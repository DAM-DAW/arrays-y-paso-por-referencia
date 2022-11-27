package main;

public class Factorial {

    int factorialRecursivo (int n){
        
    	int resultado;
        
    	if (n == 1) { //Caso base
        	return 1;
        }
        
        resultado = factorialRecursivo(n - 1)+ n;
        
        
        
        return resultado;
    }

    int factorialIterativo (int n){
        
    	int t, resultado;
        
        resultado = 1;
        
        for (t = 1; t <= n; t++) {
        	resultado *=t;
        }
        
        return resultado;
    }
}
