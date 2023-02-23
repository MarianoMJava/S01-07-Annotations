package s0107n1ejercicio2;

public class TrabajadorPresencial extends Trabajador {
	
	private static float gasolina;

	public TrabajadorPresencial(String nombre, String apellido, float sueldoHora) {
		super(nombre, apellido, sueldoHora);
	
	}

	public static float getGasolina() {
		return gasolina;
	}
	
	public static void setGasolina(float gasolina) {
		TrabajadorPresencial.gasolina = gasolina;
	}

	@Override
	public float calcularSueldo(Trabajador trabajador, float horasTrabajadas) {
		
		float sueldo = trabajador.getSueldoHora()*horasTrabajadas + gasolina;
		
		return sueldo;
	}
	
	
	@Deprecated
	public static void metodoAntiguo() {
		
		System.out.println("METODO ANTIGUO CLASE PRESENCIAL");
		
	}

}
