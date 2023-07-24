
public class Ejercicios_tema_4 {

public static void main(String[] args)  {
		
		int numeroIf = -7;
		
		if (numeroIf > 0) {
			System.out.println( " El numero es positivo "); 
		}
		
		else if (numeroIf < 0) {
			System.out.println( "El numero es negativo ");
		}
		
		else  {
			System.out.println( "El numero es 0");
		}
		
		
		
int numeroWhile = 0;
		
	    while (numeroWhile < 3) {
	    	System.out.println(numeroWhile);
	    	numeroWhile = numeroWhile + 1;
		
	    }
	    
	    do {
	    	System.out.println(numeroWhile);
	    	numeroWhile = numeroWhile + 1;
	       } while (numeroWhile == 1 );
			 

	   
	    for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
	    	System.out.println(numeroFor);
	    }
			
	    
	    var estacion = "primavera";
	    
	    switch(estacion) {
	    
	    case "verano":
	    	System.out.println("es verano ");
	    	
	    case "otoño":
	    	System.out.println("es otoño ");
	    	
	    case "invierno":
	    	System.out.println("es invierno ");
	    	
	    case "primavera":
	    	System.out.println("es primavera ");
	    	break;
	    	
	    default:
	    	System.out.println("no hay estacion");
	    }
	   
			
	   
			  
	
		}
}
