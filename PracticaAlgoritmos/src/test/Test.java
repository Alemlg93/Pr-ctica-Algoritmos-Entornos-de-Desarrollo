package test; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import util.Algoritmos; 

class Test_algoritmo { 
	
	@Test void fibonacci() { 
		 
	int fibonacciuno = 1; 
	int fibonacciResultado = Algoritmos.fibonacci(1); 
	assertEquals(fibonacciuno, fibonacciResultado); 
	}
	
	@Test void factorial() {
	
	int Factorialuno = 6; 
	int factorialResultado = Algoritmos.factorial(3); 
	assertEquals(Factorialuno, factorialResultado);
	} 
	
	@Test void esPrimos() {
		
	boolean EsPrimosuno = false; 
	boolean EsPrimosResultado = Algoritmos.esPrimo(1); 
	assertEquals(EsPrimosuno, EsPrimosResultado); 
	
		} 
	}