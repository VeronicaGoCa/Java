package JavaFuncionesBasicas;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*
		 * Encontrar si un numero entero positivo es par o impar;
		 * 
		 * */
		
		/*
		 * Primera Forma
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir un numero positivo");
		int n = sc.nextInt();
		if(n % 2 == 0){
			System.out.println("Es par");
		}else{
			System.out.println("Es no es par");
		}
		
		/*
		 * Segunda Forma  
		 * */
		
		String resultado =( n % 2 == 0) ? "par" : "impar";
		System.out.println(resultado);

	}

}
