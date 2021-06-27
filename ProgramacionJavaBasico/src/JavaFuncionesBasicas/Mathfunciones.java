package JavaFuncionesBasicas;

public class Mathfunciones {

	public static void main(String[] args) {
		
		double numero1 = 582.66;
		int numero2 = 478;
		int numero3 = 100;
		double numero4 = -45.236;
		int base = 10;
		int exponente = -2;
		
		
		/*
		 * ceil
		 * El metodo ceil devuelve un numero entero redondendado por arriba 
		 * y no depende de la parte decimal
		 * */
		
		System.out.println("ceil------>" + Math.ceil(numero1));
	
	
		
		/*
		 * round
		 * el metodo round devuelve un numero entero redondendado dependiendo 
		 * de la parte decimal 8.4 redondeo hacia abajo
		 * */
	
		System.out.println("round------>" + Math.round(numero1));
		
		/*
		 * abs
		 * 
		 * */
		
		System.out.println("abs------>" + Math.abs(numero4));
	
		/*
		 * max
		 * 
		 * */
		
		System.out.println("max------>" + Math.max(numero2, numero3));
			
		/*
		 * min
		 * 
		 * */
	
		System.out.println("min------>" + Math.min(numero2, numero3));
		/*
		 * random
		 * 
		 * */
	    
		System.out.println("random------>" + Math.random());
		double numero_random;
		int valor;
		numero_random = Math.random();
		valor = (int)(numero_random * 100);
		System.out.println("random---> " + valor);
		
		
		/*
		 * sqrt
		 * 
		 * */
		
		System.out.println("sqrt------>" + Math.sqrt(numero3));
			
		/*
		 * pow
		 * 
		 * */

		System.out.println("pow------>" + Math.pow(base, exponente));

	}

}
