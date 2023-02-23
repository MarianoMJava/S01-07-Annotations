package s0107n1ejercicio2;

public class S0107N1Ejercicio2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Trabajador trabajador1 = new Trabajador ("Juan", "Perez" , 30.50f);
		Trabajador trabajadorPresencial1 = new TrabajadorPresencial ("Mariano", "Magri" , 30.50f);
		Trabajador trabajadorOnline1 = new TrabajadorOnline ("Ana", "Maria" , 30.50f);
		
		TrabajadorPresencial.setGasolina(50f);
		
		System.out.println("Sueldo trabajador: "+trabajador1.calcularSueldo(trabajadorOnline1, 160.0f));
		System.out.println("Sueldo trabajador presencial: "+trabajadorPresencial1.calcularSueldo(trabajadorOnline1, 160f));
		System.out.println("Sueldo trabajador online: "+trabajadorOnline1.calcularSueldo(trabajadorOnline1, 160f));
		
		TrabajadorPresencial.metodoAntiguo();
		
		TrabajadorOnline.metodoAntiguo();
	

	}

}
