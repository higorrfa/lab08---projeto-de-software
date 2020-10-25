public class Negrito implements Formatacao {

	@Override
	public String formatar(String texto) {
		return "\033[1m" + texto + "\033[1m";
	}

}
