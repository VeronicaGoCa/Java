package JavaFuncionesBasicas;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean resultado;
		int valor1 = 100;
		int valor2 = 200;
		int valor3 = 300;
		int valor4 = 400;
		
        System.out.println("Resultado al evaluar el operador AND: " + !(valor1 >= valor2 && valor3 >= valor4));
		
		System.out.println("Resultado al evaluar el oprador OR: " + (valor1 <= valor2 || valor4 >= valor3));
		
		resultado = ( valor3 != 90 || 100 < 600) && ( valor1 >= 50 || valor4 == 400 );
		
		System.out.println("Resultado al evaluar los operadores AND OR : " + resultado);
		
		System.out.println("Resultado del operador NOT: " + !false);
	
		System.out.println("Resultado del operador NOT: " +!true);


	}

}
