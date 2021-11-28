package serializable;

import java.io.IOException;

public class PruebaLeer {
	/**
	 * Practicando con la clase Serializable
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		Contacto c = null;
		ContactoInput entrada = new ContactoInput();

		entrada.abrir();
		c = entrada.leer();

		while (c != null) {
			try {
				System.out.println(c + "\n");
				c = entrada.leer();
			} catch (Exception e) {// Cuando encuentra el final del fichero muestra lo siguiente
				System.out.println("Fin del fichero");
				break;
			}
		}
		entrada.cerrar();
	}
}
