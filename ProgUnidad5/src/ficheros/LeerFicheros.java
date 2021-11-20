package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheros {
	/**
	 * Acceso a un fichero contando la cantidad de vocales
	 * 
	 * @author Robert G
	 */
	static int cA = 0, cE = 0, cI = 0, cO = 0, cU = 0;

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(".\\docs\\ficheros\\notas.txt");
		BufferedReader entrada = new BufferedReader(fr);

		// Leo la primera linea del fichero
		String cadena = entrada.readLine();
		char c = ' ';

		while (cadena != null) {

			for (int i = 0; i < cadena.length(); i++) {
				c = cadena.charAt(i);
				if (c == 'A' || c == 'a') {// Si c es una A o una a
					cA++;// contadorA suma 1
				}
				if (c == 'E' || c == 'e') {// Si c es una E o una e
					cE++;// contadorE suma 1
				}
				if (c == 'I' || c == 'i') {// Si c es una I o una i
					cI++;// contadorI suma 1
				}
				if (c == 'O' || c == 'o') {// Si c es una O o una o
					cO++;// contadorO suma 1
				}
				if (c == 'U' || c == 'u') {// Si c es una U o una u
					cU++;// contadorU suma 1
				}
			} // for
			System.out.println(cadena);
			cadena = entrada.readLine();
		} // while

		System.out.println("Hay " + cA + " aes ");
		System.out.println("Hay " + cE + " ees ");
		System.out.println("Hay " + cI + " ies ");
		System.out.println("Hay " + cO + " oes ");
		System.out.println("Hay " + cU + " ues ");

		fr.close();
	}
}
