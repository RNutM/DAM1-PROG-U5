package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFichero01 {
	/**
	 * Creación de archivos TXT desde Java
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String cadena;
		/*
		 * Escribir en el fichero, poniendo true incrementa lo escrito, si lo quito borra lo
		 * anterior
		 */
		FileWriter fw = new FileWriter(".\\docs\\ficheros\\fichero.txt", true);
		PrintWriter salida = new PrintWriter(fw);

		System.out.println("Introduce un texto (hasta escribir FIN)");

		do {
			cadena = sc.nextLine();
			if (!cadena.equalsIgnoreCase("FIN"))
				salida.println(cadena);

		} while (!cadena.equalsIgnoreCase("FIN"));
		salida.close();
		sc.close();
	}
}
