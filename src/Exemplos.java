
public class Exemplos {
	public static void main(String[] args) {

		ehMaiorIdade(9);
		classificar(00);
	}
	

	public static void ehMaiorIdade(int idade) {

		if (idade >= 18) {
			System.out.println("maior de idade");
		} else {
			System.out.println("menor de idade");
		}
	}

	public static void classificar(int num) {
		
		if (num > 0) {
			System.out.println("positivo");
		}
		else {
			if (num < 0) {

				System.out.println("negativo");
			} 
			else {
				System.out.println("zero");
			}

		}

	}
	
}

