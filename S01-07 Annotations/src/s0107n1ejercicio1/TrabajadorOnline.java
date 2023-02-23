package s0107n1ejercicio1;

public class TrabajadorOnline extends Trabajador{ 
	
	private final int tarifaPlantaInt = 30;
	
	public TrabajadorOnline(String nombre, String apellido, float precioHora) {
		super(nombre, apellido, precioHora);
		
	}
	
	public int getTarifaPlantaInt() {
		return tarifaPlantaInt;
	}

	@Override
	public float calcularSueldo(Trabajador trabajador, int horasTrabajadas) {
		
		float sueldo =  trabajador.getPrecioHora()*horasTrabajadas + tarifaPlantaInt;
		
		return sueldo;
		
	}

}
