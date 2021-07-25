package Arrays;

import javax.swing.JOptionPane;

public class ArrayPractica {

	public static void main(String[] args) {
		/*
		 * Almacenar en un vector 5 tipos de frutas
		 * */
		String[] vecFrutas = new String[5];
		for (int i = 0; i < vecFrutas.length; i++) {
			vecFrutas[i] = JOptionPane.showInputDialog("Registre un afruta");
		}
		
		for (int i = 0; i < vecFrutas.length; i++) {
			System.out.println(vecFrutas[i]);
		}
		/*
		 * Utilizando ciclo foreach para mostrar los eelemenos del array unidimensional
		 * */
		System.out.println("-------------------");
		for (String valor : vecFrutas) {
			System.out.println(valor);
		}
	

	}

}
