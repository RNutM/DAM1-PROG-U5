package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EjemploST {
	/**
	 * Probando con ficheros y StringTokenizer
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// numeros01.txt -> espacios en blanco - numeros02.txt una coma para separar
		File f = new File(".\\docs\\ficheros\\numeros02.txt");
		Scanner sc = new Scanner(f);
		StringTokenizer st;
		String cadena = "";
		int numero = 0;
		int sum = 0;
		int cont = 0;

		while (sc.hasNext()) {
			cadena = sc.nextLine();
			st = new StringTokenizer(cadena, ",");
			// Para cada numero de la linea
			while (st.hasMoreTokens()) {
				numero = Integer.parseInt(st.nextToken());
				System.out.println(numero);
				sum += numero;
				cont++;
			}
		}
		System.out.println("La suma de los números es " + sum);
		System.out.println("El número de numeros es " + cont);
		sc.close();
	}
}
