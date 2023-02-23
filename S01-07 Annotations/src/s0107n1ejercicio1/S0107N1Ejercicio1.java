package s0107n1ejercicio1;

public class S0107N1Ejercicio1 {

	public static void main(String[] args) {
		
		Trabajador trabajador1 = new Trabajador("Luis", "Julio" , 30.00f);
		
		Trabajador presencial1 = new TrabajadorPresencial("Mariano", "Magri" , 30.00f);
		
		TrabajadorPresencial.setGasolina(32.00f);
		
		Trabajador online1 = new TrabajadorOnline("Ana", "Laura", 30.00f);
		
		System.out.println("Sueldo de trabajador: "+trabajador1.calcularSueldo(trabajador1, 320));
		
		System.out.println("Sueldo de trabajador presencial: "+presencial1.calcularSueldo(presencial1, 320));
		
		System.out.println("Sueldo de trabajador online: "+online1.calcularSueldo(online1, 320));

	}

}


