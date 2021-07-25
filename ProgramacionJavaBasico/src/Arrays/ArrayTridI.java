package Arrays;

import java.util.Scanner;

public class ArrayTridI {

	public static void main(String[] args) {
		int [][][] numeros = new int[2][3][2];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					System.out.println("Ingrese un numero");
					numeros[i][j][j2] = entrada.nextInt();
				}
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					System.out.println(numeros[i][j][j2]);
				}
			}
		}
		
		/*
		 * Utilizando ciclo foreach para mostrar los eelemenos del array unidimensional
		 * */
		System.out.println("-------------------");
		
		for(int [][] mat:numeros) {
			for (int[] fila : mat) {
				for (int valor : fila) {
					System.out.println(valor);
				}
			}
			
		}
		

	}

}
