
public class Exemplos {
	public static void main(String[] args) {

		ehMaiorIdade(9);
		ehMaiorIdade(50);

	}
	public static void ehMaiorIdade(int idade) {

		if (idade >= 18) {
			System.out.println("maior de idade");
		} else {
			System.out.println("menor de idade");
		}
	}
}

