package JavaFuncionesBasicas;

public class BreakDeclaracion {

	public static void main(String[] args) {
		int cont = 1;
		for(int i = 1; i<10;i++) {
			if(i == 5) {
				break;
			}
			System.out.println("Bloque for: " + i);
		}

	}

}
