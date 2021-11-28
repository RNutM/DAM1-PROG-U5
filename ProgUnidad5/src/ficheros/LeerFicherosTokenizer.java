package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LeerFicherosTokenizer {
	/**
	 * Leer ficheros con StringTokenizer
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader(".\\docs\\ficheros\\numeros02.txt");
		BufferedReader entrada = null;
		entrada = new BufferedReader(f);
		String linea; // variable
		int contadorLineas = 1; // variable
		while ((linea = entrada.readLine()) != null) { // Mientras que la entrada sea distinta de nulo
			StringTokenizer st = new StringTokenizer(linea);
			while (st.hasMoreTokens()) {
				String token = st.nextToken();

				if (token.endsWith(".")) { // si termina en un . se lo quitamos
					token = token.substring(0, token.length() - 1);// Cuento las filas
				}
				if (token != null && token.length() >= 0) {// Puedo elegir el tamaño que yo quiera para mostrar la linea

					System.out.println("La linea " + contadorLineas + " es esta cadena --> [" + token + "]"
							+ " y tiene un tamaño de " + token.length() + " filas");

					System.out.println(token);// Muestro el contenido de cada linea
				}
			}
			contadorLineas++; // Incrementamos contador de Lineas
		}
		entrada.close();
	}
}