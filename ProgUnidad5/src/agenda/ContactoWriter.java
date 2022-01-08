package agenda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ContactoWriter {
	/**
	 * Probando con ficheros
	 * 
	 * @author Robert G
	 */
	private FileWriter writer;
	private PrintWriter output;

	// Abrir el fichero
	public void abrir() throws IOException {
		writer = new FileWriter(".\\ficheros\\clientes.txt", false);
		output = new PrintWriter(writer);
	}

	// Cerrar el fichero
	public void cerrar() {
		// Si se ha abierto
		if (output != null)
			output.close();
	}

	// Escribir el fichero
	public void escribir(Contacto c) {
		if (c != null) {

			output.println(c.getNombre());
			output.println(c.getTelefono());
			output.println(c.getEmail());
			output.println(c.getDireccion());
			output.println(c.getGrupo());
			output.println(c.getDeuda());
		}
		System.out.println(c + "\n\nFichero escrito correctamente.\n");
	}
}
