public class Italico implements Formatacao {

	@Override
	public String formatar(String texto) {
		return "\033[3m" + texto + "\033[0m";
	}

}
