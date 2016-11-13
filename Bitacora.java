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
		
System.out.println("Esta seguro de querer borrar la bitacora? Presione uno(1) para continuar, o dos (2) para volver al menu principal");
		System.out.print("\nOpcion bitacora:");
		num1 = Integer.parseInt(lectura.nextLine()); 
		
		try{
		    switch(num1){
				case 1://suma
					correlativo = 1;
					cadenaBitacora = "";
					System.out.println("Borrado satisfactoriamente.");
					break;
					
				default:
					System.out.println(" Se regresara al menu principal");
				break;

			}
		}catch(Exception e){
			System.out.println("Debe elegir entre las opciones del borrado de la bitacora para continuar.");
		}
		


	}



}