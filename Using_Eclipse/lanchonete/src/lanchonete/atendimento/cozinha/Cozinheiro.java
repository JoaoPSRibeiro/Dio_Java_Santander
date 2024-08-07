package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("Adiionando lanche natural Hamburguer");
	}
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando Suco ao Balcão.");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private  void prepararLanche() {
		System.out.println("Preparando lanche tipo Hamburguer");
	}
	public void prepararVitamina() {
		System.out.println("Preparando Suco");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientes() {
		System.out.println("Selecionado o Pão, Salada, Ovo e Carne");
	}
	public void selecionarIngredientesVitamina() {
		System.out.println("Selecionado Fruta, Leite e Suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	public void baterVitaminaNoLiquidificador() {
		System.out.println("Batendo a Vitamina no Liquidificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando Ovo e Carne para o Hamburguer");
	}
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
