package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicherosMedia {
	/**
	 * Leer ficheros con FileReader y BufferedReader, hallamos la media.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(".\\docs\\ficheros\\notas.txt");
		BufferedReader entrada = new BufferedReader(fr);

		// Leo la primera linea del fichero
		String cadena = entrada.readLine();
		String[] linea;
		float contlineas = 0.0f, suma = 0.0f;

		while (cadena != null) {
			System.out.println(cadena);
			contlineas++;
			linea = cadena.split(" ");// Cuando llega al espacio en blanco es otra cadena
			// Convierto cadena en números en este caso Float si quiero Enteros Integer.parseInt
			suma += Float.parseFloat(linea[1]);
			// System.out.println("Primer elemento: "+linea[0]);
			// System.out.println("Segundo elemento: "+linea[1]);
			cadena = entrada.readLine();
		} // while

		System.out.println("La suma de las notas es: " + suma);
		System.out.println("La media de las notas es: " + suma / contlineas);

		entrada.close();
	}
}
