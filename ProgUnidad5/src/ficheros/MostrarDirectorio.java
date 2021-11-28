package ficheros;

import java.io.File;
import java.util.Arrays;


public class MostrarDirectorio {
	/**
	 * Leer directorio y mostrar su contenido
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {
		File directorio = new File(".\\docs\\ficheros");
		String[] lista = directorio.list();
		Arrays.sort(lista);// Para ordenar los archivos
		for (int i = 0; i < lista.length; i++)
			System.out.println(lista[i]);
	}
}
