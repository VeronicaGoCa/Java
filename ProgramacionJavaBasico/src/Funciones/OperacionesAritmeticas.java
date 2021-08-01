package Funciones;

import java.util.Scanner;

public class OperacionesAritmeticas {

	public static void main(String[] args) {
		/*
		 * Dado dos valores enteros sumar, restar, multiplicar y dividir 
		 * Nota.- Resolver mediante funciones
		 * */
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inpresar el primer valor");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		System.out.println("La suma de los dos valores es: " + sumar(num1, num2) );
		System.out.println("La resta de los dos valores es: " + restar(num1, num2) );
		System.out.println("La multiplicación de los dos valores es: " + multiplicar(num1, num2) );
		System.out.println("La división de los dos valores es: " + dividir(num1, num2) );

	}
	private static double dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return (double)num1/num2;
	}

	private static int multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	private static int restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	private static int sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
}
