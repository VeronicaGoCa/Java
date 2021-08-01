package Funciones;

public class ArrayBidimensional {

	public static void main(String[] args) {
		/*
		 * Crear un array bidimensional y/o matriz de 4 filas y 4 
		 * columnas y almacenar números pares y mostrar los mismos
		 * 
		 * */
		int[][] arrayNumerosPares = new int[4][4];
		llenarArray(arrayNumerosPares);
		mostrarArray(arrayNumerosPares);
	}
	private static void llenarArray(int[][] arrayNumerosPares) {
		int c=2;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arrayNumerosPares[i][j]=c;
				c+=2;
			}
		}
		
	}

	private static void mostrarArray(int[][] arrayNumerosPares) {
		
		for (int[] fila : arrayNumerosPares) {
			for (int valor : fila) {
				System.out.print(valor);
			}
			System.out.println();
		}
		
	}

}
