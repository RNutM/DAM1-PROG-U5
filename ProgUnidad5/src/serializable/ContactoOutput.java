package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ContactoOutput {
	/**
	 * Practicando con la clase Serializable
	 * 
	 * @author Robert G
	 */
	private FileOutputStream file;
	private ObjectOutputStream output;

	// Abrir el fichero
	public void abrir() throws IOException {
		file = new FileOutputStream(".\\docs\\ficheros\\clientes.ser");
		output = new ObjectOutputStream(file);
	}

	public void cerrar() throws IOException {
		if (output != null)
			output.close();
	}

	public void escribir(Contacto c) throws IOException {
		if (output != null)
			output.writeObject(c);
	}
}
