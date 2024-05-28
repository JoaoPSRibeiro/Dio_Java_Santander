package Pilares_POO;

public class Autodromo {
	public static void main(String [] args) {
		Carro jeep = new Carro();
		
		jeep.setChassi("87987566");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("556689");
		z400.ligar();
		System.out.println("");
		System.out.println("");
		
		Veiculo coringa = z400;
		coringa.ligar();
		// aqui temos o conceito de polimorfismo.
		// o coringa herda de Veiculo mas, quando mudamos a atribuição, 
		// mudamos o resultado final
		
	}
}
	