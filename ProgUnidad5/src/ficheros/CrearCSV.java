package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class CrearCSV {
	/**
	 * Creación de archivos CSV desde Java
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		final String nombreDeArchivo = "otro.csv";
		crearArchivoCSV(nombreDeArchivo);
	}

	private static void crearArchivoCSV(String nombreDeArchivo) {
		// Esto tambien puede ser "\t" para el delimitador de pestañas
		crearArchivoCSV(nombreDeArchivo, ";");
	}

	private static void crearArchivoCSV(String file, String delim) {
		final String NEXT_LINE = "\n";
		try {
			FileWriter fw = new FileWriter(".\\docs\\ficheros\\" + file, false);

			fw.append("Columna 1").append(delim);
			fw.append("Columna 2").append(delim);
			fw.append("Columna 3").append(delim);
			fw.append(NEXT_LINE);// Doy un salto de linea con lo que escribimos en la siguiente fila del archivo csv
			fw.append("123").append(delim);
			fw.append("456").append(delim);
			fw.append("789").append(delim);

			fw.flush();
			fw.close();
		} catch (IOException e) {
			// Error al crear el archivo, por ejemplo, el archivo
			// está actualmente abierto.
			e.printStackTrace();
		}
	}
}

/**
 * Apunte: Si en lugar de querer crear el fichero en el trayecto que pongo en el
 * FileWriter de la linea 20, quiero crearlo a la misma altura de directorio donde se
 * encuentra el fichero java pondre solo file como muestro en este ejemplo:
 * FileWriter fw = new FileWriter(file);
 */