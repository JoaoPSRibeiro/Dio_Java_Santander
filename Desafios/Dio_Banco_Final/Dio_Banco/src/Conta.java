
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++; 
		this.cliente = cliente;
		// sempre que uma conta for criada, o número dela será sequencial +1
		
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor); //objeto de origem
		contaDestino.depositar(valor);	// objeto de destino
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome())); // duas casas decimais
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: R$ %s", this.saldo)); // duas casas decimais
	}
	
}
/* uma classe abstrata não pode ser instanciada. 
no nosso caso, só poderemos instanciar conta corrente ou poupança */