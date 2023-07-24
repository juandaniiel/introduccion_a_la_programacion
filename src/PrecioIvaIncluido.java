
public class PrecioIvaIncluido {

	public static void main(String[] args) {
		
		double resultado = calcularIva(300.000);
		
		System.out.println(resultado+"00");

	}

	
	static double calcularIva (double base) {
		
		return (double) 1.19 * base;
		
		
		
}
}
