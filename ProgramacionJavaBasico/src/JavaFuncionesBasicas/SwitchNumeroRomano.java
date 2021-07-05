package JavaFuncionesBasicas;

import java.util.Scanner;

public class SwitchNumeroRomano {

	public static void main(String[] args) {
		/*
		 * Dado un n entero positivo entre 1 y 5 encontrar su equivalencia en numero romano.
		 * 
         * */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un digito entre 1 el 5");
		int valor = entrada.nextInt();
		if ( valor >= 1 && valor <=5) {
			switch (valor) {
			case 1:
				System.out.println( valor + " en romano es: I");
				break;
			case 2:
				System.out.println( valor + " en romano es II");
				break;
			case 3:
				System.out.println( valor + " en romano es III");
				break;
			case 4:
				System.out.println( valor + " en romano es IV");
				break;
			case 5:
				System.out.println( valor + " en romano es V");
				break;
			default:
				break;
			}
		}


	}

}
