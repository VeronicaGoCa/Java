package Funciones;

public class CalculoArea {

	public static void main(String[] args) {
		/*
		 * Calcular el area de:
		 * Cuadrado
		 * Rectangulo
		 * Triangulo
		 * 
		 * */
		
		/*
		 * Cuadrado
		 * 
		 * */
		
		double longitud=4.5;
		areaCuadrado(longitud);
		/*
		 * Rectangulo
		 * 
		 * */
		double longitud2 = 10.6;
		double ancho = 5;
		areaRectangulo(longitud2, ancho);
		/*
		 * Triangulo
		 * */
		double base = 5.5;
		double altura = 6.5;
		areaTriangulo(base, altura);

	}
	private static void areaCuadrado(double longitud) {
		System.out.println("Area del cuadrado: " + Math.pow(longitud, 2));
		
	}
	
	private static void areaRectangulo(double longitud2, double ancho) {
		// TODO Auto-generated method stub
		System.out.println("Area del rectangulo: " + longitud2 * ancho);
		
	}
	private static void areaTriangulo(double base, double altura) {
		// TODO Auto-generated method stub
		System.out.println("Area del triangulo: " + (base * altura)/2);
		
	}

}
