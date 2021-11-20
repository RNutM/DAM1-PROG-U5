package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CrearHTML {
	/**
	 * Creación de archivos HTML desde Java
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) throws IOException{

		Scanner sc=new Scanner(System.in);
		/*Escribir en el fichero, poniendo true 
		incrementa lo escrito si lo quito borra lo anterior*/
		FileWriter fw=new FileWriter(".\\docs\\ficheros\\tablas.html", false);
		PrintWriter salida=new PrintWriter(fw);
		salida.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"es-ES\">\r\n" + 
				"<head>\r\n" + 
				"	<meta charset=\"UTF-8\">\r\n" + 
				"	<title>Tablas</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<h1>Las tablas de multiplicar</h1>");

		for(int i=1;i<=10;i++) {
			salida.println("<table border='1px'>");
			salida.println("<h1>Tabla del "+i+"</h1>");
			for(int j=1;j<=10;j++) {
				int n = 0;
				n=i*j;
				salida.println("<tr>\r\n" + 
						"			<td>" +i+"*"+j+"</td>\r\n" + 
						"			<td>"+n+"</td>\r\n" + 
						"		</tr>\r\n");
			}
			salida.println("</table>");
		}
		salida.println("</body></html>");
		salida.close();
		sc.close();
	}
}
