import java.util.Scanner;

public class Calculadora{
    
    
//variables
    double num1, num2;
    Scanner lectura;    
   
 Bitacora bitacora;

    
//constructor (para inicializar las variables y dar memoria)
   
 public Calculadora(){
    	
num1 = 0; num2 = 0;
    	
lectura = new Scanner(System.in);    
    	
bitacora = new Bitacora(1);
    }
    
    
public void obtenerNumeros(){
		
System.out.print("Numero 1:");
		
num1 = Double.parseDouble(lectura.nextLine());
		
		
System.out.print("Numero 2:");
		
num2 = Double.parseDouble(lectura.nextLine());

		
System.out.println(""); 
	
}
    	
    
public void imprimirMenu(){
    
System.out.println("--------------------");	
       
 System.out.println("CALCULADORA 1.0");						
       
 System.out.println("Elija una opcion");
        
System.out.println("1. Suma dos numeros");
       
 System.out.println("2. Resta dos numeros");
        
System.out.println("3. Multiplicacion dos numeros");
       
 System.out.println("4. Division dos numeros");
       
 System.out.println("5. Ver bitacora");
        
System.out.println("6. Borrar bitacora");
      
  System.out.println("7. Salir");
   
 }
    
   
 public void retornaOperacion(int operacion){
	    
	
    //segun la operacion elegida
	   
 switch(operacion){
			
case 1://suma
				
System.out.println("\nOpcion elegida: Suma");
			
    obtenerNumeros();
			 
   mostrarResultado(""+(num1+num2));
		
		bitacora.agregarABitacora(num1+" + "+num2+" = "+(num1+num2));
		
		break;
			
case 2://resta
			
	System.out.println("\nOpcion elegida: Resta");
		
	    obtenerNumeros();
			 
   mostrarResultado(""+(num1-num2));
			
	bitacora.agregarABitacora(num1+" - "+num2+" = "+(num1-num2));
		
		break;
		
	case 3://multiplicacion 
				
System.out.println("\nOpcion elegida: Multiplicacion");
	
		    obtenerNumeros();
			   
 mostrarResultado(""+(num1*num2));
			  
 	bitacora.agregarABitacora(num1+" * "+num2+" = "+(num1*num2));
			
	break;
			
case 4://division 
				
System.out.println("\nOpcion elegida: Division");
		
	    obtenerNumeros();
	
		    if(num2==0){				    	
			       
 mostrarError("El divisor no puede ser igual a cero.");
			       
 bitacora.agregarABitacora(num1+" / "+num2+" = Error");
			 
   }
			
    else{
	
			    mostrarResultado(""+(num1/num2));
	
			    bitacora.agregarABitacora(num1+" / "+num2+" = "+(num1/num2));

			    }
				
break;
			
case 5://ver bitacora 

					System.out.println("\nOpcion elegida: Ver Bitacora");

					System.out.println(bitacora.mostrarBitacora());
		
		break;
			
case 6://borrar bitacora
				
	System.out.println("\nOpcion elegida: Borrar Bitacora");

					bitacora.borrarBitacora();
	
			break;
case 7:

 break;			
		
	default:
				
System.out.println("Opcion no reconocida");
	
			break;
			
	
		}
	   
	
   System.out.println(""); 
	   
 
	}

	
public void mostrarResultado(String resultado){
	
	System.out.println("     El resultado es: "+resultado);
	
}

	
public void mostrarError(String resultado){
	
	System.out.println("     Error: "+resultado);	

	}
    

 
   
}