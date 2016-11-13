import java.util.Scanner;


public class Main {
    

	public static void main(String[] args) {
	
        
	    Calculadora miCalculadora = new Calculadora();     
	  
  Scanner lectura = new Scanner(System.in); 
	
    int select = 0;

		
while(select != 7){
	
		try{
          
      miCalculadora.imprimirMenu();
    
            System.out.print("\nOpcion: ");
	
			select = Integer.parseInt(lectura.nextLine()); 
		
		
	            miCalculadora.retornaOperacion(select);
	
		}catch(Exception e){
		
		System.out.println("Ocurrio un error inesperado.");
	
		}
		
}
	
}
	

}
