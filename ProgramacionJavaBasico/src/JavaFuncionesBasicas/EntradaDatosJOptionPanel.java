package JavaFuncionesBasicas;

import javax.swing.JOptionPane;

public class EntradaDatosJOptionPanel {

	public static void main(String[] args) {
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre");
		JOptionPane.showConfirmDialog(null, "Saludos de " + nombreUsuario);

	}

}
