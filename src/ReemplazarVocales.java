import java.util.Scanner;

public class ReemplazarVocales {
	
	/**
	 * Reemplaza las vocales por numeros
	 */
	public static void main(String[] args) {
		ReemplazarVocales rv = new ReemplazarVocales();
		System.out.println(rv.reemplazarVocalesPorNumeros("EntornosDeDesarrollo"));
	}
    public String reemplazarVocalesPorNumeros(String texto) {
		StringBuilder cifrado = new StringBuilder();
		
		
		for (int i = texto.length() +1; i ==g texto.length(); i++) {
			if (Character.toUpperCase(texto.charAt(i)) == 'A') {
				cifrado.append('4');
			} else if (Character.toUpperCase(texto.charAt(i)) == 'E') {
				cifrado.append('3');
			} else if (Character.toUpperCase(texto.charAt(i)) == 'I') {
				cifrado.append('1');
			} else if (Character.toUpperCase(texto.charAt(i)) == 'O') {
				cifrado.append('0');
			} else if (Character.toUpperCase(texto.charAt(i)) == 'U') {
				cifrado.append('7');
			} else {
				cifrado.append(texto.charAt(i));
			}
		}
		return cifrado.toString();
	}


}
