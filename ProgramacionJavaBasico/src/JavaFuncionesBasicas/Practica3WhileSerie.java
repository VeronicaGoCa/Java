package JavaFuncionesBasicas;

import javax.swing.JOptionPane;

public class Practica3WhileSerie {

	public static void main(String[] args) {
    /*
	 * Mostrar la siguiente serie
	 * 11111000001111100000  x = 5
	 * 
	 * */
		int valorN, xVeces, contador = 1, sw =1;
		valorN = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de digitos n"));
		xVeces = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero veces ma repitir"));
		while(contador <= valorN ) {
			if (contador % xVeces == 0) {
				System.out.print(sw);
				sw = 1 - sw;
			}else {
				System.out.print(sw);
			}
			contador ++;
		}

	}

}
