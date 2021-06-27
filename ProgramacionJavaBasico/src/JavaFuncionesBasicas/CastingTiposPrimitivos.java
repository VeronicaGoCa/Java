package JavaFuncionesBasicas;

public class CastingTiposPrimitivos {

	public static void main(String[] args) {
		/*
		 * Casting Implicito
		 * */
		
		int numero1 = 32767;   //Ocupa un espacio de 32 bits
		long numero2 = numero1;	//Ocupa un espacio de 64 bits
		
		short numero3 = 100;
		int numero4 = numero3;
		
		/*
		 * Casting Explicito
		 * */
		
		double numero5 = 0.1;   //Ocupa un espacio de memoria de 64 bits
		float numero6 = (float)numero5; //Ocupa un espacio de memoria de 32 bits
		
	/*
	 * Nota.- Tomar en cuenta que si se hace un casting a una variable que es mayor
	 * al destino habra perdida de precision o perdida de datos 
	 * */
		
		short numero11 = 126;   // -32768 a 32757
		byte numero12 =(byte) numero11;  // -128 a 127
		System.out.println("El numero :" + numero11 + "convertido a tipo de dato byte: " + numero12);

	}

}
