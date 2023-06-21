
public class Persona {

	
	// Ojo con hacer las variables public.....
	private String nombre;
	private Integer edad;
	
	/***
	 * Esto es un ejemplo de un metodo hablar dentro de la clase persona.....
	 */
	public void hablar() {
		System.out.println("Hola a todos soy una persona");
		System.out.println("Y me llamo " + nombre);
	}
	
	/***
	 * Esto es un ejemplo de metodo que retorna un valor....
	 * @return Un Boolean si es mayor de edad no...
	 */
	public Boolean esMayorDeEdad() {
		if(edad >= 18) {
			return true;
		} else {
			System.out.println("Ojo que no es mayor de edad.....");
			return false;
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
