
public class Main {
	public static void main (String[] args) {
		Cliente JoaoPaulo = new Cliente();
		JoaoPaulo.setNome("Joao Paulo");

		Conta cc = new ContaCorrente(JoaoPaulo);
		cc.depositar(100);
		cc.sacar(0);

		Conta poupanca = new ContaPoupanca(JoaoPaulo);
		poupanca.depositar(0);
		cc.transferir(0, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
