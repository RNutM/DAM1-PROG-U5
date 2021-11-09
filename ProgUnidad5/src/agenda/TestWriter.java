package agenda;

import java.io.IOException;

public class TestWriter {
	/**
	 * Probando con ficheros
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {

		Contacto c1 = new Contacto("María Sanchez", "666587412", "ms@correo.es", "C/Mayor 3", 1, 6.0);
		Contacto c2 = new Contacto("Juan Ramirez", "622544785", "jr@correo.es", "C/Principal 8", 2, 6.0);

		ContactoWriter salida = new ContactoWriter();

		salida.abrir();
		salida.escribir(c1);
		salida.escribir(c2);
		salida.cerrar();
	}
}
