package cadenas;

public class Cadena_charAt {
	/**
	 * Probando con charAt
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		String s1 = "Este es el método de cadena de caracteres";

		// devuelve el valor char en el índice 0
		System.out.println("Carácter en la posición 0 es:" + s1.charAt(0));

		// devuelve el valor de char en el quinto índice

		System.out.println("Carácter en la 5ta posición es:" + s1.charAt(5));

		// devuelve el valor de char en el 22 ° índice

		System.out.println("Carácter en la posición 22 es:" + s1.charAt(22));

		// devuelve el valor de char en el 23 ° índice
		// char resultado = s1.charAt(23);
		char resultado = s1.charAt(-1);
		System.out.println("Carácter en la posición 23 es:" + resultado);
	}
}

/*
 * Entrada de parámetros:
 * 
 * index – Este método de Java acepta solo una entrada, que es un tipo de datos int.
 * 
 * Método de devoluciones:
 * 
 * Este método devuelve datos de tipo de caracteres basados ​​en la entrada de índice
 * 
 * Excepción:
 * 
 * Lanza java.lang.StringIndexOutOfBoundsException si el valor del índice no está
 * entre 0 y String length menos uno
 */

/*
 * Algunas cosas importantes sobre este método Java charAt:
 * 
 * Este método Java toma un argumento que siempre es de tipo int.
 * 
 * Este método devuelve el carácter como char para el argumento int dado.
 * 
 * El valor int especifica el índice que comienza en 0. Si el valor del índice es
 * mayor que la longitud de la cadena o un valor negativo, se produce un error de
 * excepción de IndexOutOfBounds.
 * 
 * El rango de índice debe estar entre 0 y string_length-1.
 */