package JavaFuncionesBasicas;

import javax.swing.JOptionPane;

public class ForPractica1 {

	public static void main(String[] args) {
		/*
		* Resolver la siguiente sumatoria
		* s = x1 + x2 + x3 + x4....n
		* */
		int num, varX, sum=0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Introducir el numero de terminos para la sumatoria"));
		varX = Integer.parseInt(JOptionPane.showInputDialog("Introducir el valor de la variable X"));
		for(int i=1 ; i <= num; i++) {
			sum = sum + (int)Math.pow(varX, i);
		}
		System.out.println("La sumatoria es: "+ sum );

	}

}
