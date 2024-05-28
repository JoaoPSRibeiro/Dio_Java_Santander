package src.Telefone;

public class telefone implements AparelhoTelefonico {
	public void ligar() {
		System.out.println("Digite o telefone para quem deseja ligar: ");
	}
	public void atender() {
		System.out.println("Oi, tem alguém te ligando!!!");
		
	}
	public void iniciarCorreioVoz() {
		System.out.println("Caso queira iniciar correio de voz, aperte aqui!");
		System.out.println("");
	}
}
