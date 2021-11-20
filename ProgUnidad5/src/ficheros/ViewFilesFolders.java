package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class ViewFilesFolders {
	/**
	 * Ver ficheros y directorios desde Java
	 * 
	 * @author Robert G
	 */
	public void MostrarInfoFichero(String path) throws IOException {

		File fichero = new File(path);
		// Si el fichero existe
		System.out.println("\n-------Mostrado contenido-------");
		if (fichero.exists()) {
			System.out.println("El nombre es: " + fichero.getName());
			System.out.println("Ruta completa " + fichero.getAbsolutePath());
			System.out.println("Tamaño del fichero " + fichero.length() + " bytes");
			System.out.println("Ultima modificación " + new Date(fichero.lastModified()));

			if (fichero.isFile())
				System.out.println("Es un fichero");
			else if (fichero.isDirectory()) {
				System.out.println("Es un directorio y contiene:");
				mostrarContenidoDirectorio(fichero);
			} else {
				throw new IOException("El fichero" + path + " no existe");
			}
		}
	}

	public void mostrarContenidoDirectorio(File directorio) {
		String lista[] = directorio.list();
		Arrays.sort(lista); // Ordeno alfabéticamente
		System.out.println("\n-------Mostrado contenido del directorio-------");
		for (int i = 0; i < lista.length; i++)
			System.out.println("\t" + lista[i]);
	}

	public static void main(String[] args) throws IOException {
		ViewFilesFolders vff = new ViewFilesFolders();

		File directorio1 = new File(".\\docs\\ficheros\\"); // directorio a listar

		// Si queremos mostrar el contenido de lo haremos de la siguiente forma:
		File directorio2 = new File("c:/"); // directorio a listar

		vff.MostrarInfoFichero(".\\docs\\ficheros\\clientes.txt");

		vff.MostrarInfoFichero(".\\docs\\ficheros\\");

		vff.mostrarContenidoDirectorio(directorio1);

		vff.mostrarContenidoDirectorio(directorio2);
	}
}
