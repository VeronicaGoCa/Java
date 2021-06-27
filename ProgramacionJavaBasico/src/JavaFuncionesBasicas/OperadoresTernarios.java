package JavaFuncionesBasicas;

import javax.swing.JOptionPane;

public class OperadoresTernarios {

	public static void main(String[] args) {
		String resultado;
		int numero_cuotas = Integer.parseInt(JOptionPane.showInputDialog("Introducir el nuemro de cuotas"));
		resultado = numero_cuotas >= 12 ? "El monto adeudado sera cancelado en mas o igual de un año" :"El monto adeudado sera cancelado en menos de un año";
		JOptionPane.showMessageDialog(null, resultado);

	}

}
