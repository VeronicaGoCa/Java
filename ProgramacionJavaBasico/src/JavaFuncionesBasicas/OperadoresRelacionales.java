package JavaFuncionesBasicas;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		int valor1 = 25, valor2 = 30;
		boolean igual, distinto, menor, mayor, menor_igual, mayor_igual;
		
		igual = valor1 == valor2;
		distinto = valor1 != valor2;
		mayor = valor1 > valor2;
		menor = valor1 < valor2;
		mayor_igual = valor1 >= valor2;
		menor_igual = valor1 <= valor2;
		
            System.out.println("Resultado de la comparacion Igual que: " + valor1 + " y " + valor2 + " : " + igual);
			System.out.println("Resultado de la comparacion Distinto que: " + valor1 + " y " + valor2 + " : " + distinto);
			System.out.println("Resultado de la comparacion Mayor que: " + valor1 + " y " + valor2 + " : " + mayor);
			System.out.println("Resultado de la comparacion Menor que: " + valor1 + " y " + valor2 + " : " + menor);
			System.out.println("Resultado de la comparacion Mayor Igual que: " + valor1 + " y " + valor2 + " : " + mayor_igual);
			System.out.println("Resultado de la comparacion Menor Igual que: " + valor1 + " y " + valor2 + " : " + menor_igual);


	}

}
