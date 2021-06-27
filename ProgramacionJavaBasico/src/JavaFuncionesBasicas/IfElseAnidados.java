package JavaFuncionesBasicas;

import java.util.Scanner;

public class IfElseAnidados {

	public static void main(String[] args) {
   /* RESOLVER EL SIGUIENTE EJERCICIO:
     * El cliente podra aperturar una cuenta de caja de ahorro con un monto minimo de 50000 en caso contrario
	 * no se podra realizar la solicitud  
	 
	 * Para montos mayores iguales a 100000 el interes sera del 10%  
	 * en caso contrario solo podra obtener un interes del 3% 
	 * 
	 * Mostrar el interes correspondiente al monto introducido
	 * 
	 * */	
		
	 int monto;
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Introducir el monto a depositar");
	 monto = entrada.nextInt();
	 if( monto >= 50000) {
		if( monto >= 100000)
			System.out.println("El interes sera del 10%");
		else
			System.out.println("El interes sera del 3%");
			
	 }else {
		 System.out.println("Lo siento no podra aperturar la caja de ahorro");
	 }

	}	

}




