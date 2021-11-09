package agenda;

public class Contacto {
	/**
	 * Probando con ficheros
	 * 
	 * @author Robert G
	 */
	private String nombre;
	private String email;
	private String direccion;
	private String telefono;
	private int grupo;
	private double deuda;

	// Constantes

	public static final int TRABAJO = 1;
	public static final int FAMILIA = 2;
	public static final int AMIGOS = 3;

	public Contacto(String nombre) {
		this.nombre = nombre;
	}

	public Contacto(String nombre, String email, String direccion, String telefono, int grupo, double deuda) {
		this.nombre = nombre;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.grupo = grupo;
		this.deuda = deuda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	@Override
	public String toString() {
		return (this.nombre + " (" + this.email + ")\n Telefono: " + this.telefono + "\n Direccion " + this.direccion
				+ "\n Grupo " + this.grupo + "\n Deuda " + this.deuda + " €");
	}
}
