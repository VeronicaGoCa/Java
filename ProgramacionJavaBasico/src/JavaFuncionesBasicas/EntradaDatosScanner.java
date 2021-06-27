package JavaFuncionesBasicas;

import java.util.Scanner;

public class EntradaDatosScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre_usuario = entrada.nextLine();
		System.out.println(nombre_usuario);
		
		System.out.println("Ingrese su apellido");
		String apellido = entrada.nextLine();
		System.out.println(apellido);
		
		
		System.out.println("Ingrese su edad");
		int edad_usuario = entrada.nextInt();
		System.out.println(edad_usuario);
		
		/*
		 * Aplicando el Metodo next() de la clase Scanner
		 *  
		 * */
		
		System.out.println("Ingrese una frase");
		String frase1 = entrada.next();
		String frase2 = entrada.next();
		String frase3 = entrada.next();
		System.out.println("La frase es: " + frase1);
		System.out.println("La frase es: " + frase2);
		System.out.println("La frase es: " + frase3);	
		

	}

}
