package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerFicherosScanner {
	/**
	 * Leer ficheros con Scanner y File
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws FileNotFoundException {

		File f = new File(".\\docs\\ficheros\\notas.txt");
		Scanner entrada = new Scanner(f);
		String cadena = "";
		while (entrada.hasNext()) {// lee cadena
			cadena = entrada.nextLine();
			System.out.println(cadena);
		}
		entrada.close();
	}
}
