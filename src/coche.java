
public class coche {
	
	int puertas = 0;	
	public coche() {
		
	}

 public static void main(String[] args) {

		suma (3,4,5);
		
		coche micoche = new coche();
	    micoche.agregar_puertas();
		micoche.mostrar_puertas();
	}

 
public static int suma (int a,int b,int c) {
	
	int resultado  = a + b + c;
	System.out.println("el resultado es "+resultado);
	return resultado;
}





		

public void agregar_puertas (){
	puertas++;

}

public void mostrar_puertas() {
	System.out.println("el numero de puertas es "+ puertas);

}



}




