package JavaFuncionesBasicas;

public class ContinuePractica1 {

	public static void main(String[] args) {
		/*
		 * Dado una cadena mostrar solo los consonantes
		 * */
		String palabra = "MAMIFERO";
		char caracter;
		for(int i=0; i<palabra.length(); i++) {
			caracter = palabra.charAt(i);
			if (caracter == 'A'  || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' ) {
				continue;
			}
			System.out.println(caracter);
		}
		

	}

}
