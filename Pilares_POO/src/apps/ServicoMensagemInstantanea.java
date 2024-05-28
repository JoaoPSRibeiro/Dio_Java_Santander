package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	// mais um método que os filhos deverão implementar
	// public abstract void salvarHistoricoMensagem();
	
	// somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado à Internet.");
	}
}
