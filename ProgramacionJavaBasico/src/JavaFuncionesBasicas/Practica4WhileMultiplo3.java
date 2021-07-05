package JavaFuncionesBasicas;

public class Practica4WhileMultiplo3 {

	public static void main(String[] args) {
		/*
		 * Mostrar los múltiplos de 3 entre 0 y 15
		 * 3, 6,9,15
		 * */
		
		int cont = 1;

		while( cont <= 15){
		if ( cont % 3 == 0){
		System.out.print(cont +" ,");
		}
		cont += 1;
		}


	}

}
