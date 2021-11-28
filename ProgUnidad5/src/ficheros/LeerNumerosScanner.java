package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNumerosScanner {
	/**
	 * Leer ficheros con Scanner y File. Sumo esos numeros y cuento cuantos hay.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws FileNotFoundException {

		File f = new File(".\\docs\\ficheros\\numeros01.txt");
		Scanner entrada = new Scanner(f);
		int numero;
		int suma = 0;
		int cont = 0;
		while (entrada.hasNextInt()) {// lee numeros enteros
			numero = entrada.nextInt();
			suma += numero;
			cont++;
			System.out.println("Numero: " + numero);
		}
		System.out.println("La suma de las cantidades es: " + suma);

		System.out.println("Hay un total de " + cont + " números.");
		entrada.close();
	}
}
