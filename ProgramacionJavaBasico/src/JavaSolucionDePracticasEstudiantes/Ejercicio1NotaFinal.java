package JavaSolucionDePracticasEstudiantes;

import java.util.Scanner;

public class Ejercicio1NotaFinal {

	public static void main(String[] args) {
		        // RESUELTO POR ELISEO QUISPE 
				/*
				 * 	Calcular por media o promedio ponderada de calificaciones 
				 * 	la nota final de acuerdo a las siguientes categorías:
					primer parcial sobre el 		20% 
					segundo parcial sobre el 		20%
					tercer parcial sobre el 		30% 
					trabajos prácticos sobre el 	20%
					Asistencia sobre el 			10%
					TOTAL						   (100%)
					
					Nota. Todas las notas serán ponderadas sobre el 100% 
					Tomar en cuenta que los estudiantes presentaron tres trabajos prácticos
					cada uno ponderadas pobre el 100% Leer desde teclado las notas
					(primer parcial, segundo parcial, tercer parcial, notas de los tres trabajos prácticos y de asistencia)
				 */
				
				System.out.println("\n\tEJERCICIO 1\n");
				double nota1erP,nota2doP,nota3erP,prac1,prac2,prac3,notaAsistencia,NOTAFinal=0;
				
				Scanner teclado=new Scanner(System.in);
				System.out.println("INGRESE DATOS DE 0 a 100%");
				System.out.println("Introduzca nota 1erParcial");
				nota1erP = teclado.nextDouble();
				System.out.println("Introduzca nota 2doParcial");
				nota2doP = teclado.nextDouble();
				System.out.println("Introduzca nota 3erParcial");
				nota3erP = teclado.nextDouble();
				
				System.out.println("---Introduzca nota PRIMERA Practica");
				prac1 = teclado.nextInt();
				System.out.println("---Introduzca nota SEGUNDA Practica");
				prac2 = teclado.nextInt();
				System.out.println("---Introduzca nota TERCERA Practica");
				prac3 = teclado.nextInt();
				System.out.println("Introduzca nota de ASISTENCIA:");
				notaAsistencia=teclado.nextDouble();
				
				//primer parcial sobre el 		20% 
				//segundo parcial sobre el 		20%
				//tercer parcial sobre el 		30% 
				//trabajos prácticos sobre el 	20%
				//Asistencia sobre el 			10%
				nota1erP=nota1erP*20/100;
				nota2doP=nota2doP*20/100;
				nota3erP=nota3erP*30/100;
				double notaPracticas=((prac1+prac2+prac3)/3)*20/100 ;
				notaAsistencia=notaAsistencia*10/100;
				NOTAFinal=nota1erP+nota2doP+nota3erP+notaPracticas+notaAsistencia;
				
				System.out.println("\n\tCALIFICACIONES. ");
				System.out.println("NOTA 1er Parcial : "+nota1erP);
				System.out.println("NOTA 2do Parcial : "+nota2doP);
				System.out.println("NOTA 3er Parcial : "+nota3erP);
				System.out.println("NOTA PRACTICAS : "+notaPracticas);
				System.out.println("NOTA Asistencia : "+notaPracticas);				
				System.out.println("\nNOTA FINAL: "+NOTAFinal);
				

	}

}
