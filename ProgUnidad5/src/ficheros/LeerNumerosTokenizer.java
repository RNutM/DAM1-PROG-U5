package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeerNumerosTokenizer {
	/**
	 * Leer ficheros File. StringTokenizer para ir cogiendo cada número.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		String fichero = ".\\docs\\ficheros\\numeros02.txt";
		File f = new File(fichero);

		if (f.exists()) {
			Scanner sc = new Scanner(f);
			System.out.println("Números del fichero");

			while (sc.hasNext()) {
				StringTokenizer st = new StringTokenizer(sc.next(), ",");

				while (st.hasMoreTokens()) {
					System.out.print(st.nextToken() + "\t");
					System.out.println("");
				}
			}
			sc.close();
		} else {
			System.out.println("El fichero no existe");
		}
	}
}
