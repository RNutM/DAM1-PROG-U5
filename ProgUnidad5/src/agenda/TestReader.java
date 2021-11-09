package agenda;

import java.io.IOException;

public class TestReader {
	/**
	 * Probando con ficheros
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		ContactoReader entrada = new ContactoReader();
		Contacto leido = new Contacto("");

		// Abro el fichero clientes.txt
		entrada.abrir();
		while (leido != null) {

			leido = entrada.leer();
			if (leido != null)
				System.out.println(leido);
		}
		entrada.cerrar();
	}
}
