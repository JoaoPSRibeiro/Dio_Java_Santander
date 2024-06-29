
import java.util.Scanner;

public class Main{	

public static void main (String[] args) {
		Cliente JoaoPaulo = new Cliente();
		JoaoPaulo.setNome("Joao Paulo");

		Conta poupanca = new ContaPoupanca(JoaoPaulo);
		Conta cc = new ContaCorrente(JoaoPaulo);

		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 3) {
		System.out.println("-=-=-=- Seja Bem Vindo ao Banco Santander - DIO -=-=-=- ");
		System.out.println("-=-=-=- Escolha uma opção -=-=-=- \n");
		System.out.println("[ 1 ] Conta Corrente \n[ 2 ] Conta Poupança");
		
		opcao = scanner.nextInt();

		switch (opcao) {
			case 1:
				int opcao1 = 0;
				while(opcao1 != 5){
					System.out.println("Selecione uma Opção: \n");
					System.out.println("[ 1 ] Consulta Saldo \n[ 2 ] Depósito \n[ 3 ] Saque \n[ 4 ] Transferência \n[ 5 ] Encerrar Acesso");
					opcao1 = scanner.nextInt();

					switch (opcao1) {
						case 1:
							System.out.println("Exibindo extrato");
							cc.imprimirExtrato();
							break;
						case 2:
							System.out.println("Opção de depósito Selecionada");
							cc.depositar(100);
							cc.imprimirExtrato();
							break;
						case 3:
							System.out.println("Opção de Saque selecionada");
							cc.sacar(50);
							break;
						case 4:
							System.out.println("OpÇão de Transferência selecionada");
							cc.transferir(90, poupanca);
							break;
						case 5:
							System.out.println("Encerrando Sessão...");
							opcao = 3;
							break;
						default:
							System.out.println("Opção Inválida.");
							break;
						}
					}
					break;
			case 2:
				int opcao2 = 0;
				while (opcao2 != 5) {
					System.out.println("Selecione uma Opção: \n");
					System.out.println("[ 1 ] Consulta Saldo \n[ 2 ] Depósito \n[ 3 ] Saque \n[ 4 ] Transferência \n[ 5 ] Encerrar Acesso");
					opcao2 = scanner.nextInt();

					switch (opcao2) {
						case 1:
							System.out.println("Exibindo extrato");
							poupanca.imprimirExtrato();
							break;
						case 2:
							System.out.println("Opção de depósito Selecionada");
							poupanca.depositar(100);
							poupanca.imprimirExtrato();
							break;
						case 3:
							System.out.println("Opção de Saque selecionada");
							poupanca.sacar(50);
							break;
						case 4:
							System.out.println("OpÇão de Transferência selecionada");
							poupanca.transferir(90, cc);
							break;
						case 5:
							System.out.println("Encerrando Sessão...");
							opcao = 3;
							break;
						default:
							System.out.println("Opção Inválida.");
							break;
						}
					}
					break;
			case 3:
				System.out.println("Saindo do sistema. Obrigado por usar nossos serviços.");
				break;
			default:
				System.out.println("Opção inválida, tente novamente");
				break;
			}
		}
		scanner.close();

		}
	}