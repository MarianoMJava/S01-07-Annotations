package s0107n1ejercicio1;

public class TrabajadorPresencial extends Trabajador{
	
	private static float gasolina;

	public TrabajadorPresencial(String nombre, String apellido, float precioHora) {
		super(nombre, apellido, precioHora);
		
	}

	public static float getGasolina() {
		return gasolina;
	}

	public static void setGasolina(float gasolina) {
		TrabajadorPresencial.gasolina = gasolina;
	}
	
	@Override
	public float calcularSueldo(Trabajador trabajador, int horasTrabajadas) {
		
		float sueldo =  trabajador.getPrecioHora()*horasTrabajadas + TrabajadorPresencial.gasolina;
		
		return sueldo;
		
	}
}
