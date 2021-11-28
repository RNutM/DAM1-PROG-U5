package serializable;

import java.io.IOException;

public class PruebaEscribir {
	/**
	 * Practicando con la clase Serializable
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException {
		
		Contacto c1=new Contacto("Robert Gutiérrez", "666777888", "rg@correo.es", "C/ Saturno, 7", 1, 5.5);
		Contacto c2=new Contacto("José Jiménez", "999111222", "jj@correo.es", "C/ Júpiter, 6", 2, 7.2);
		ContactoOutput salida=new ContactoOutput();
		salida.abrir();
		salida.escribir(c1);
		salida.escribir(c2);
		salida.cerrar();
		System.out.println("///////Fichero escrito correctamente///////");
	}
}
