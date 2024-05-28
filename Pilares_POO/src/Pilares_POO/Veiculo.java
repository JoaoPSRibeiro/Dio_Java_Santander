package Pilares_POO;

public abstract class Veiculo {
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public abstract void ligar();
	// cada classe que usar o método abstrato LIGAR() pode personalizar
	// da maneira que achar melhor, por exemplo Carro lidadO ou moto ligadA!
}
