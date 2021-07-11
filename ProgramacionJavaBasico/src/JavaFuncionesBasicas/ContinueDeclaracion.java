package JavaFuncionesBasicas;

public class ContinueDeclaracion {

	public static void main(String[] args) {
		int cont = 0;
		for (int i = 1; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println("Bloque for: " + i);
			
		}

	}

}
