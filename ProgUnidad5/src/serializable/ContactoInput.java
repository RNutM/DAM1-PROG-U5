package serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ContactoInput {
	/**
	 * Practicando con la clase Serializable
	 * 
	 * @author Robert G
	 */
	private FileInputStream file;
	private ObjectInputStream input;

	// Abrir el fichero
	public void abrir() throws IOException {
		file = new FileInputStream(".\\docs\\ficheros\\clientes.ser");
		input = new ObjectInputStream(file);
	}

	public void cerrar() throws IOException {
		if (input != null)
			input.close();
	}

	public Contacto leer() throws IOException {
		Contacto c = null;
		if (input != null) {
			try {
				c = (Contacto) input.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("No encuentra la clase contacto");
			}
		}
		return c;
	}
}
