package JavaFuncionesBasicas;

import javax.swing.JOptionPane;

public class Practica1NotaFinal {

	public static void main(String[] args) {
		/*
		 *Calcular por media o promedio ponderada de calificaciones la nota final de acuerdo a las siguientes categorías: 
		 *primer parcial sobre el 20% 
		 *segundo parcial sobre el 20% 
		 *tercer parcial sobre el 30% 
		 *trabajos prácticos sobre el 20% 
		 *Asistencia sobre el 10% 
		 *Nota. - Todas las notas serán ponderadas sobre el 100% Tomar en cuenta que los estudiantes 
		 *presentaron tres trabajos prácticos cada uno ponderadas pobre el 100% Leer desde teclado las notas 
		 *(primer parcial, segundo parcial, tercer parcial, notas de los tres trabajos prácticos y de asistencia) 
         *Apoyarse en el siguiente link: https://www.youtube.com/watch?v=3ZOM-ylqeTU 
		*/
		
		double primerParcial, segundoParcial, tercerParcial, asistencia, trabajoPractico1, trabajoPractico2, notaPromedioTP, trabajoPractico3, notaFinal;
		primerParcial = Double.parseDouble(JOptionPane.showInputDialog("Introducir la nota del primer parcial sobre el 100 %"));
		segundoParcial = Double.parseDouble(JOptionPane.showInputDialog("Introducir la nota del segundo parcial sobre el 100 %"));
		tercerParcial = Double.parseDouble(JOptionPane.showInputDialog("Introducir la nota del tercer parcial sobre el 100 %"));
		trabajoPractico1 = Double.parseDouble(JOptionPane.showInputDialog("Introducir la nota del trabajo practico 1 sobre el 100 %"));
		trabajoPractico2 = Double.parseDouble(JOptionPane.showInputDialog("Introducir la nota del trabajo practico 2 sobre el 100 %"));
		trabajoPractico3 = Double.parseDouble(JOptionPane.showInputDialog("Introducir la nota del trabajo practico 3 sobre el 100 %"));
		asistencia = Double.parseDouble(JOptionPane.showInputDialog("Introducir la nota de la aistencia sobre el 100 %"));
		
		notaPromedioTP = (((trabajoPractico1 + trabajoPractico2 + trabajoPractico3)/3)*20)/100;
		notaFinal = (primerParcial * 20)/100 + (segundoParcial * 20)/100 + (tercerParcial * 20)/100 + (asistencia * 20)/100 + notaPromedioTP;
		
		JOptionPane.showConfirmDialog(null, "La nota final es: " + notaFinal);
		
		
		
	}

}
