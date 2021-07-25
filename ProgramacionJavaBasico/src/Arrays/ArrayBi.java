package Arrays;

public class ArrayBi {

	public static void main(String[] args) {
		int[][] numeros = new int[2][3];
		numeros[0][0]=1;
		numeros[0][1]=1;
		numeros[0][2]=1;
		numeros[1][0]=1;
		numeros[1][1]=1;
		numeros[1][2]=1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(numeros[i][j]);
			}
		}
		/*
		 * Utilizando ciclo foreach para mostrar los eelemenos del array unidimensional
		 * */
		System.out.println("-------------------");
		for (int[] fila : numeros) {
			for (int valor : fila) {
				System.out.println(valor);
			}
		}

	}

}
