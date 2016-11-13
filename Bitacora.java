import java.util.Scanner;

import java.util.Date;

import java.text.SimpleDateFormat;


public class Bitacora{

	int correlativo;    
	
String cadenaBitacora;
    
//constructor
	
public Bitacora(int inicializador){
		
correlativo = inicializador;
		
cadenaBitacora = "";
	
}
    
	
public void agregarABitacora(String operacion){
		
String date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
		
cadenaBitacora += correlativo+". "+date+":  "+operacion+ "\n";
		
correlativo++;
	
}


	
public String mostrarBitacora(){
		
return "\n"+cadenaBitacora;
	}


	
public void borrarBitacora(){
    	
int num1=0;
		
Scanner lectura = new Scanner(System.in); 
		
System.out.println("Selecciono la opcion \"Borrado Bitacora\", ¿Esta seguro de querer borrar la\n bitacora? Presione\"1\"(si) para continuar, o \"2\"(no) para volver al menu principal");
		System.out.print("\nOpcion bitacora:");
		num1 = Integer.parseInt(lectura.nextLine()); 
		
		try{
			
		    if(num1==1){
				
					correlativo = 1;
					cadenaBitacora = "";
					System.out.println("");
					System.out.println("Seleccion la opcion \"1\"...La Bitacora a sido borrada satisfactoriamente.");

	


				}else if (num1==2) {
					System.out.println("");
					System.out.println("Seleccion la opcion \"2\"...Se regresara al menu principal");
				}		

			
		}catch(Exception e){
			System.out.println("Debe elegir entre las opciones del borrado de la bitacora para continuar.");
		}
				}
		


	}



