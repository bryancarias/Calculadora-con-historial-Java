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
		
System.out.print("Ingese el primer Numero: ");
		
num1 = Double.parseDouble(lectura.nextLine());
		
		
System.out.print("Ingrese el segundo Numero: ");
		
num2 = Double.parseDouble(lectura.nextLine());

		
System.out.println(""); 
	
}
    	
    
public void imprimirMenu(){
	System.out.println(" ");

System.out.println("PROYECTO EN JAVA");
    
System.out.println("----------------");	
       
 System.out.println("Elija una opcion");
        
System.out.println("1. Suma dos numeros");
       
 System.out.println("2. Resta dos numeros");
        
System.out.println("3. Multiplicacion dos numeros");
       
 System.out.println("4. Division dos numeros");
       
 System.out.println("5. Ver Bitacora");
        
System.out.println("6. Borrar Bitacora");
      
  System.out.println("7. Salir");

   
 }
    
   
 public void retornaOperacion(int operacion){
	    
	
    //segun la operacion elegida
	   
 switch(operacion){
			
case 1://suma
				
System.out.println("Seleciono la opcion\"1. Suma de dos numeros\"");
			
    obtenerNumeros();
			 
   mostrarResultado(""+(num1+num2));
		
	bitacora.agregarABitacora(num1+" + "+num2+" = "+(num1+num2));
	System.out.println("");
 	System.out.println("");
 	System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
 	Scanner lee = new Scanner(System.in);
 	String dato = "";
 	dato=lee.nextLine();
		
		break;
			
case 2://resta
			
	System.out.println("Seleciono la opcion\"1. Resta de dos numeros\"");
		
	    obtenerNumeros();
			 
   mostrarResultado(""+(num1-num2));
			
	bitacora.agregarABitacora(num1+" - "+num2+" = "+(num1-num2));
	System.out.println("");
 	System.out.println("");
 	System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
 	Scanner le = new Scanner(System.in);
 	String dat = "";
 	dat=le.nextLine();
		
		break;
		
	case 3://multiplicacion 
				
System.out.println("Seleciono la opcion\"1. Multiplicacion de dos numeros\"");
	
		    obtenerNumeros();
			   
 mostrarResultado(""+(num1*num2));
			  
 	bitacora.agregarABitacora(num1+" * "+num2+" = "+(num1*num2));
 	System.out.println("");
 	System.out.println("");
 	System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
 	Scanner leer = new Scanner(System.in);
 	String datos = "";
 	datos=leer.nextLine();
			
	break;
			
case 4://division 
				
System.out.println("Seleciono la opcion\"1. Division de dos numeros\"");
		
	    obtenerNumeros();
	
		    if(num2==0){				    	
			       
 mostrarError("Division entre cero No es permitida");
			       
 bitacora.agregarABitacora(num1+" / "+num2+" = Error");
 System.out.println("");
 	System.out.println("");
 	System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
 	Scanner leeros = new Scanner(System.in);
 	String datitos = "";
 	datitos=leeros.nextLine();
			 
   }
			
    else{
	
			    mostrarResultado(""+(num1/num2));
	
			    bitacora.agregarABitacora(num1+" / "+num2+" = "+(num1/num2));
			    System.out.println("");
 	System.out.println("");
 	System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
 	Scanner leeres = new Scanner(System.in);
 	String datose = "";
 	datose=leeres.nextLine();

			    }
				
break;
			
case 5://ver bitacora 

					System.out.println("Seleciono la opcion\"5. Ver Bitacora\"");

					System.out.println(bitacora.mostrarBitacora());
									System.out.println("");
 	System.out.println("");
					System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
 	Scanner reir = new Scanner(System.in);
 	String todo = "";
 	todo=reir.nextLine();
		
		break;
			
case 6://borrar bitacora
				
	
					bitacora.borrarBitacora();
					System.out.println("");
 	System.out.println("");
 	System.out.println("Presione una tecla para desplegar nuevamente el Menu Principal");
 	Scanner imprimir = new Scanner(System.in);
 	String codigo = "";
 	codigo=imprimir.nextLine();
	
			break;
case 7:// salir
System.out.println("--------------------------------------------------- ");
 System.out.println("- programa se a cerrado \"gracias por utilizarlo\" -");
 System.out.println("--------------------------------------------------- ");

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