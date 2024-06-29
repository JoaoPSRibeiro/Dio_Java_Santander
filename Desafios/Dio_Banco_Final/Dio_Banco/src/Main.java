
public class Main {
	public static void main (String[] args) {
		Cliente JoaoPaulo = new Cliente();
		JoaoPaulo.setNome("Joao Paulo");

		Conta cc = new ContaCorrente(JoaoPaulo);
		cc.depositar(01000);
		cc.sacar(100);

		Conta poupanca = new ContaPoupanca(JoaoPaulo);
		poupanca.depositar(2);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
