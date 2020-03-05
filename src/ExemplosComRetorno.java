
public class ExemplosComRetorno {
	public static String concatenar(String nome, String sobrenome) {
	
		return nome + "  " + sobrenome;

	}

	public static int TamanhonomeCompleto(String nome, String sobrenome) {
	
		String nomeCompleto = concatenar (nome, sobrenome);
		return nomeCompleto.length();
	}

	public static void main(String[] args) {
		String nome = concatenar ("rogerio", "morais");
		int tamanho = TamanhonomeCompleto("rogerio","morais");
		System.out.println("Nome: "+ nome);
		System.out.println("Qtde: " + tamanho +" caracteres");
	}
}
