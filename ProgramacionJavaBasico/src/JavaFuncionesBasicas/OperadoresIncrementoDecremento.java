package JavaFuncionesBasicas;

public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		boolean resultado;
		int valor1 = 100;
		int valor2 = 200;
		int valor3 = 300;
		int valor4 = 400;
		int contador_i = 9;
		int contador_j = 9;
		
		contador_i ++;
		System.out.println("Valor del contador i: " + contador_i);
		
		++ contador_j;
		System.out.println("Valor del contador j: " + contador_j);
		
		/*
		 * Nota.- Ambos operadores funciona igual pero su comportamiento es diferente
		 * */
		System.out.println("Valor del contador i: " + contador_i ++);
		System.out.println("Valor del contador j: " + ++contador_j);
		

	}

}
