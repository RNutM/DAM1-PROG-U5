package agenda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContactoReader {

	private FileReader reader;
	private BufferedReader input;

	// Abrir el fichero
	public void abrir() throws IOException {
		reader = new FileReader(".\\docs\\ficheros\\clientes.txt");
		input = new BufferedReader(reader);
	}

	// Cerrar el fichero
	public void cerrar() throws IOException {

		if (input != null)
			input.close();
	}

	// Leer los contactos del fichero

	public Contacto leer() throws IOException {
		Contacto c = null;
		String cadena = "";
		// Nombre
		cadena = input.readLine();
		if (cadena != null) {
			c = new Contacto(cadena);
			c.setNombre(cadena);
			// Telefono
			cadena = input.readLine();
			c.setTelefono(cadena);
			// Email
			cadena = input.readLine();
			c.setEmail(cadena);
			// Direccion
			cadena = input.readLine();
			c.setDireccion(cadena);
			// Grupo
			cadena = input.readLine();
			c.setGrupo(Integer.parseInt(cadena));
			// Deuda
			cadena = input.readLine();
			c.setDeuda(Double.parseDouble(cadena));
			System.out.println("\nFichero leído correctamente.");
		}
		return c ;
	}
}
