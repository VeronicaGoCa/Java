package JavaFuncionesBasicas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int cont = 10;
		int num;
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println(cont);
			
		}while(cont < 5);
		/*
		 * Validar que el numero ingresado desde teclaso sea un numero positivo
		 * */
		
		do {
			System.out.println("Introducir un valor positivo");
			num = entrada.nextInt();
		}while( num <= 0);
		
		System.out.println("Exito ha introducido un valor positivo");

	}

}
