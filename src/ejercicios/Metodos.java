package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
		String v1 = "LeBron " ;
		String v2 = "James";
		
		System.out.println(lakers(v1, v2));
		
		int numero = 76;
		
		System.out.println(ascii(numero));
	}
	
	
	public static String lakers(String v1, String v2) {
		
		String vt = v1 + v2;
		
		return vt;
	}

	
	public static char ascii(int numero) {
		
		char numAscii = (char) numero;
		
		return numAscii;
	}
}
