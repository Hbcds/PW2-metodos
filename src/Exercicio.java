
public class Exercicio {
	public static int somar(int n1,int n2) {
		
		return n1 + n2;

	}
	
	public static int proximo(int n3) {
		
		return n3+1;

	}
	
	public static int dobro(int n4) {
		
		return n4*2;

	}
	public static void main(String[] args) {
		int resultadoSoma = somar(10,100);
		System.out.println("soma:" + resultadoSoma);
		
		int proximoNumero = proximo(1);
		System.out.println("soma:" + proximoNumero);
	
		int dobroNumero = dobro(2);
		System.out.println("soma:" + dobroNumero);
}
}