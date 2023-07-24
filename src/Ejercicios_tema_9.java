
public class Ejercicios_tema_9 {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.edad = 27;
		cliente.nombre = "maria";
		cliente.telefono = 3245678787l;
		cliente.credito = 345.567f;
		System.out.println(cliente.edad);
		System.out.println(cliente.nombre);
		System.out.println(cliente.telefono);
		System.out.println(cliente.credito);
	
		Trabajador trabajador = new Trabajador();
		trabajador.edad = 50;
		trabajador.nombre = "mateo";
		trabajador.telefono = 3453245667l;
		trabajador.salario = 1000.456f;
		System.out.println(trabajador.edad);
		System.out.println(trabajador.nombre);
		System.out.println(trabajador.telefono);
		System.out.println(trabajador.salario);
		
		
	}

}

class Personita {
	int edad;
	String nombre;
	long telefono;
}

class Cliente extends Personita  {
	float credito;
}

class Trabajador extends Personita  {
	float salario;
	
}