package s0107n1ejercicio2;

public class Trabajador {

	private String nombre;
	private String apellido;
	private float sueldoHora;
	
	public Trabajador(String nombre, String apellido, float sueldoHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoHora = sueldoHora;
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

	public float getSueldoHora() {
		return sueldoHora;
	}

	public void setSueldoHora(float sueldoHora) {
		this.sueldoHora = sueldoHora;
	}
	
	public float calcularSueldo(Trabajador trabajador, float horasTrabajadas) {
		
		float sueldo = trabajador.getSueldoHora()*horasTrabajadas;
		
		return sueldo;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", sueldoHora=" + sueldoHora + "]";
	}
	
	
	
	
	
}
