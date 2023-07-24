
public class Ejercicios_tema_8 {

	public static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.setedad(19);
		System.out.println(persona.getedad() +" edad ");
		
		persona.setnombre("Marta");
		System.out.println(persona.getnombre() +" nombre ");
		
		persona.settelefono(3147483648l);
		System.out.println(persona.gettelefono()+" numero de telefono");

	}

}

class Persona {
	
	private int edad;
	private String nombre;
	private long telefono;
	
	public void setedad(int edad) {
		this.edad = edad;
}
	public int getedad() {
		return this.edad;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getnombre() {
		return this.nombre;
	}
	
	public void settelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public long gettelefono() {
		return this.telefono;
	}
} 
