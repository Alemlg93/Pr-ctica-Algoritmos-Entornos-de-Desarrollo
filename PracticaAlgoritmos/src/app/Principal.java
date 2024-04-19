package app;
		
import java.util.Random;
import util.Algoritmos;

		public class Principal {
		    public static void main(String[] args) {
		        Random rand = new Random();
		  
		        int[] numeros = new int[5];
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = rand.nextInt(10) + 1;  
		        }
     
		        int[] resultadoFibonacci = new int[5];
		        int[] resultadoFactorial = new int[5];
		        boolean[] resultadoPrimos = new boolean[5];

		        for (int i = 0; i < numeros.length; i++) {
		            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
		        }
		  
		        for (int i = 0; i < numeros.length; i++) {
		            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
		        }

		        for (int i = 0; i < numeros.length; i++) {
		            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
		        }
		    

		    }
	}


