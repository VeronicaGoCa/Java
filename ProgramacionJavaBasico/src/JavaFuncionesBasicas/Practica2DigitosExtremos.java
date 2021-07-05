package JavaFuncionesBasicas;

import java.util.Scanner;

public class Practica2DigitosExtremos {

	public static void main(String[] args) {
		 /*
		 * Dado un numero de tres digitos intercambiar los digitos extremos
		 * 
		 * */
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introducir un valor de tres digitos");
			int digito = entrada.nextInt();
			int ultimoDig = digito % 10;
			int primerDig = digito / 100;
			int aux = digito/10;
			int digCentral = aux % 10;
			System.out.println(primerDig);
			System.out.println(digCentral);
			System.out.println(ultimoDig);
			int numInv = ultimoDig*100 + digCentral*10 + primerDig;
			System.out.println(digito +" ---- "+ numInv);
			
			

	}

}
