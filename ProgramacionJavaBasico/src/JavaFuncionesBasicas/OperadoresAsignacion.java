package JavaFuncionesBasicas;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		int caja_ahorro = 1000;
		caja_ahorro += 200;
		System.out.println("Total caja de ahorro: " + caja_ahorro);
		
		caja_ahorro -= 200;
		System.out.println("Total caja de ahorro -200: " + caja_ahorro);
		
		caja_ahorro *= 2;
		System.out.println("Total caja de ahorro *2: " + caja_ahorro);
		
		caja_ahorro /= 2;
		System.out.println("Total caja de ahorro /2: " + caja_ahorro);

	}

}
