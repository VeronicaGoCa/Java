package JavaFuncionesBasicas;

public class ForConceptos {

	public static void main(String[] args) {
		int valor1 = 2;
		int valor2 = 10;
		for(int i = 1; i<=2; i++) {
			System.out.println(i);
		}
		
		for(int i = Math.min(valor1, valor2); i <valor2; i+=Math.min(valor1, valor2)) {
			System.out.println("valor: " + i);
		}
		
		for( int i = 0; i<2; i++);
		
		int j = 1;
		for(; j!=5 ;) {
			System.out.println("valor2 : " + j);
			j++;
		}
		
		int k = 1;
		for(;;) {
			System.out.println("valor3 : " + k*2);
			k++;
		}

	}

}
