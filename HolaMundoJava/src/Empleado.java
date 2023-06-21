

/***
 * Ejemplo de utilizacion de herencia entre empleado y personas
 * @author claudiozamoszczyk
 */
public class Empleado extends Persona {

	private Double sueldo;
	
	@Override
	public void hablar() {
		super.hablar();
		System.out.println("Ojo que soy empleado y puedo hablar como quiera");
	}
	
	public void trabajar() {
		System.out.println("Estoy trabajando.....");
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
}
