public class Texto {

	private String corpo;

	public Texto(String corpo) {
		super();
		this.corpo = corpo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	@Override
	public String toString() {
		return "Texto: " + this.corpo;
	}

	public String formatar(Formatacao formatacao) {
		return formatacao.formatar(this.corpo);

	}

}
