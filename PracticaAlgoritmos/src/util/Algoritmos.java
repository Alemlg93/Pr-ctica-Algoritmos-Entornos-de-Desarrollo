package util;

public abstract class Algoritmos {
	
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
}

	   
