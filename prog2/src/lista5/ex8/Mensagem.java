package lista5.ex8;

abstract class Mensagem {
	protected String texto;

	public Mensagem(String texto) {
		this.texto = texto;
	}

	public abstract void enviar();
}
