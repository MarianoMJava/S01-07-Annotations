package s0107n1ejercicio1;

public class Trabajador {

	private String nombre;
	private String apellido;
	private float precioHora;

	public Trabajador(String nombre, String apellido, float precioHora) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.precioHora = precioHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}

	public float calcularSueldo(Trabajador trabajador, int horasTrabajadas) {
		
		float sueldo = trabajador.getPrecioHora()*horasTrabajadas;
		
		return sueldo;
		
	}

}
