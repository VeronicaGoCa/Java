package JavaFuncionesBasicas;

public class BreakPractica1 {

	public static void main(String[] args) {
		/*
		 * 
		 * VErificar si un numero es primo
		 * */
		int num = 8;
		int cont = 2;
		boolean swPrimo = false;
		while(cont<num) {
			if( num % cont != 0) {
				swPrimo = true;
			}else {
				swPrimo = false;
				break;
			}
			cont ++;
		}
		if (swPrimo) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}

	}

}
