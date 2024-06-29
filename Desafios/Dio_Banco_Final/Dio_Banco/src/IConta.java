
public interface IConta {
	double sacar(double valor);
	double depositar(double valor); 
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
	/* não é necessário declarar o PUBLIC
	 saque e depósito precisam Obrigatóriamente ter um valor
	 transferência precisa de valor e destino */
}
