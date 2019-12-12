package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
		String v1 = "LeBron " ;
		String v2 = "James";
		System.out.println(lakers(v1, v2));
		
		int numero = 76;
		System.out.println(ascii(numero));
		
		char norChar = '$';
		System.out.println(normal(norChar));
		
		int num1 = 60;
		int num2 = 3;
			
		cuentaAtras(num1, num2);
	}
	
	
	public static String lakers(String v1, String v2) {
		
		String vt = v1 + v2;
		//MASTER
		return vt;
	}

	
	public static char ascii(int numero) {
		
		char numAscii = (char) numero;
		
		return numAscii;
	}

	
	public static int normal(char norChar)  {
		
		int numerito = (int) norChar;
		
		return numerito;
	}
	
	
	public static int cuentaAtras(int numMain, int numCuenta) {
			
		do {
			
			numMain = numMain - numCuenta;
			System.out.println(numMain);
			
		} while (numMain > 0);
		
		return numMain;
	}
}
