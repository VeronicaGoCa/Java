package JavaFuncionesBasicas;

public class MetodosCadenas {

	public static void main(String[] args) {
		/*
		 * A continuacion ejemplificaremos
		 * los Metodos disponibles para la clase String
		 * que es parte del paquete java.lang
		 *   
		 * */
		
		/*
		 * toLowerCase()
		 * metodo que convierte los caracteres de una cadena en minuscula
		 * */
		
		System.out.println("1.- metodo que convierte los caracteres de una cadena en minuscula");
		String nombre = "JOSE";
		System.out.println(nombre.toLowerCase());
		
		/*
		 * toUpperCase()
		 * metodo que convierte los caracteres en mayuscula
		 * */
		System.out.println("2.- metodo que convierte los caracteres en mayuscula");
		String pais = "Bolivia";
		System.out.println(nombre.toUpperCase());
		
		/*
		 * replace(char anteriorCaracter, char nuevoCaracter)
		 * metodo que remplaza un caracter por otro
		 * Nota.- remplaza todos los caracteres antiguos encontrados
		 * */

		System.out.println("3.- metodo que remplaza un caracter por otro ");
		String mensaje = "La musica te relaja";
		System.out.println(mensaje.replace('a', 'l'));
		
		/*
		 * trim()
		 * metodo que elimina los espacios en blanco al inicio y final de la cadena
		 * */

		System.out.println("4.- metodo que elimina los espacios en blanco al inicio y final de la cadena");
		String descripcion = "  Bolivia    ";
		System.out.println(descripcion.trim());
	
		
		/*
		 * String substring(int indiceInicial)
		 * metodo que devuelve una subcadena desde el indice incial hasta el final de la cadena
		 * nota.- el inicio de la cadena inicia en el indice 0
		 * */
			
		System.out.println("5.- metodo que devuelve una subcadena desde el indice incial hasta el final de la cadena");
		String departamento = "La Paz";
		System.out.println(departamento.substring(3));

		
		/*
		 * substring(int indiceInicial, int indiceFinal)
		 * metodo que que devuelve una subcadena desde el indice incial hasta el indice final
		 * */
		System.out.println("6.-metodo que que devuelve una subcadena desde el indice incial hasta el indice final" );
		String departamento1 = "La Paz";
		System.out.println(departamento1.substring(3,5));

		/*
		 * length()
		 * metodo que devuelve el tamaño de la cadena
		 * */
		
		System.out.println("7.-metodo que devuelve el tamaño de la cadena ");
		System.out.println(departamento1.length());
		
		/*
		 * char charAt(int indice)
		 * metodo que devuelve el caracter de la posicion indice
		 * nota.- inicia desde el indice 0
		 * */
		
		 System.out.println(" 8.-  metodo que devuelve el caracter de la posicion indice");
		 String provincia = "Challapata";
		 System.out.println(provincia.charAt(7));


		/*
		 * boolean equals(Object cadena)
		 * metodo que que permite compara si dos cadenas son iguales
		 * */
		 	
		 System.out.println("9.- metodo que que permite compara si dos cadenas son iguales ");
		 String materia1 = "matematica I";
		 String materia2 = "Matematica I";
		 System.out.println(materia1.equals(materia2));


		
		/*
		 * boolean equalsIgnoreCase(String cadenaAComprar)
		 * metodo que que compara dos cadenas omitiendo si es mayuscula o minuscula
		 * 
		 * */
		 System.out.println("10.-metodo que que compara dos cadenas omitiendo si es mayuscula o minuscula ");
		 System.out.println(materia1.equalsIgnoreCase(materia2));

		
		/*
		 * String valueOf()
		 * metodo que permite convertir cualquier tipo de dato a cadena
		 * 
		 * */

		 System.out.println("11.- metodo que permite convertir cualquier tipo de dato a cadena ");
		 char arrayPais[] = {'h','o','l'};
		 System.out.println(String.valueOf(arrayPais));


		/*
		 * int indexOf(String cadena)
		 * metodo que busca una cadena dentro de otra y devuelve un numero entero a partir del cual inicia
		 * devuelve -1
		 * 
		 * */

		 System.out.println("12.- metodo que busca una cadena dentro de otra y devuelve un numero entero a partir del cual inicia ");	
         String nombreCancion= "Adoracion para el tiempo";
         String nombreCan = "paraff";
         System.out.println(nombreCancion.indexOf(nombreCan));

		/*
		 * boolean endsWith(String cadena)
		 * metodo que nos verifica si la cadena termina con la cadena especificada 
		 *  
		 * */
         
         System.out.println("13.-metodo que nos verifica si la cadena termina con la cadena especificada  ");
         String materiales = "boligrafo cuaderno carta";
         String material = "carta";
         System.out.println(materiales.endsWith(material));

		
		/*
		 * boolean startsWith(String cadena)
		 * metodo que nos verifica si la cadena inicia con la cadena especificada
		 * */

         System.out.println("14.-metodo que nos verifica si la cadena inicia con la cadena especificada  ");
         String materiales1 = "boligrafo cuaderno carta";
         String material1 = "carta";
         System.out.println(materiales.startsWith(material));

		
		/*
		 * String concat(String cadena)
		 * metodo que nos permite concatenas dos cadenas
		 * */
		
         System.out.println("15.-metodo que nos permite concatenas dos cadenas ");
         String cadena1 = "Bienvenido";
         String cadena2 = "al curso de Java";
         System.out.println(cadena1.concat(cadena2));
         
		
		/*
		 * Concatenar con el signo +
		 * */
		
         System.out.println("16.- concatenar");
         System.out.println(cadena1 + " " +cadena2 );



	}

}
