package util;

public abstract class Algoritmos {
	
	/*
	  *  Devuelve el fibonacci de un numero 
	  * @param  Numero el cual queremos saber cual es su factorial
	  * @return	el factorial del numero especificado
	  * 
	  */
	
	public static int fibonacci (int numero) {
    if (numero <= 1) {
        return numero;
    } else {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= numero; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
 /*
  *  Devuelve el factorial de un numero 
  * @param  Numero el cual queremos saber cual es su factorial
  * @return	el factorial del numero especificado
  * 
  */
	    public static int factorial(int numero) {
	        if (numero == 0 || numero == 1) {
	            return 1;
	        } else {
	            int resultado = 1;
	            for (int i = 2; i <= numero; i++) {
	                resultado *= i;
	            }
	            return resultado;
	        }
	    }
	        
    /*
     *  Comprueba si un numero es primo o no
     * @param  Numero el cual queremos saber si es primo o no
     * @return	Indica si el numero es primo o no
     * 
     */        
	    public static boolean esPrimo (int numero) {
	            if (numero <= 1) {
	                return false;
	            }
	            for (int i = 2; i<= (numero-1); i++) {
	                if (numero % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        
	    }
	    
}
	   
