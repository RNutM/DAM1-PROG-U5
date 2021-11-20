package ficheros;

import java.io.*;

public class AlumnosNotaMedia {
	/**
	 * Notas medias de cada alumno
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(".\\docs\\ficheros\\notas1.csv");
		// Clase BufferedReader
		BufferedReader entrada = new BufferedReader(fr);

		// Leo la primera linea del fichero
		String cadena = entrada.readLine();
		String[] linea;

		int contlineas = 0;
		double suma = 0.0, media = 0.0;

		FileWriter fw = new FileWriter(".\\docs\\ficheros\\notamedia.txt", false);
		PrintWriter salida = new PrintWriter(fw);

		cadena = entrada.readLine();
		while (cadena != null) {
			suma = 0;
			System.out.println(cadena);
			contlineas++;
			linea = cadena.split(";");
			for (int i = 1; i < linea.length; i++)
				suma += Double.parseDouble(linea[i]);

			media = (double) Math.round((suma / (linea.length - 1)) * 100) / 100;
			salida.println(linea[0]+ " tiene de media " + media);// escribe el fichero notamedia.txt
			System.out.println((linea[0] + " tiene de media " + media + "\n"));// muestro en consola

			cadena = entrada.readLine();

		} // while

		System.out.println("La nota media total es de " + (media * contlineas) / contlineas);

		entrada.close();
		salida.close();
		fw.close();
	}
}
