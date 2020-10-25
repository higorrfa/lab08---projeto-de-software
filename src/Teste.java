
public class Teste {

	public static void main(String[] args) {

		Texto texto = new Texto("ABC 123 Exemplo de Texto");

		System.out.println(texto.formatar(new Italico()));
		System.out.println(texto.formatar(new Negrito()));
		System.out.println(texto.formatar(new CaixaAlta()));
		System.out.println(texto.formatar(new CaixaBaixa()));

	}

}
