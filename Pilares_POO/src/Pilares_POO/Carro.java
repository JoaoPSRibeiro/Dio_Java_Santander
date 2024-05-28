package Pilares_POO;

public class Carro extends Veiculo {
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	//métodos confereCombustivel e confereCambio estão 
	//encapsulados, só visíveis na classe carro
	private void confereCombustivel() {
		System.out.println("Conferindo Combustível");
	}
	private void confereCambio() {
		System.out.println("Conferido Cambio em P");
	}
}
