package s0107n1ejercicio2;

public class TrabajadorOnline extends Trabajador {
	
	private final float tarifaPlanaInt = 30;

	public TrabajadorOnline(String nombre, String apellido, float sueldoHora) {
		super(nombre, apellido, sueldoHora);
	
	}

	
	@Override
	public float calcularSueldo(Trabajador trabajador, float horasTrabajadas) {
		
		float sueldo = trabajador.getSueldoHora()*horasTrabajadas + tarifaPlanaInt;
				
		return sueldo;
		
	}
	
	@Deprecated
	public static void metodoAntiguo() {
		
		System.out.println("METODO ANTIGUO CLASE ONLINE");
		
	}
}
