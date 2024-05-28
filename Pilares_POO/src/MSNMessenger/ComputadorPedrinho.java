package MSNMessenger;
import java.util.Scanner;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;


public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		/* COMO NÃO SABEMOS QUAL APP SERÁ RESCOLHIDO, TODOS DEVEM SER
		 * CAPAZES DE ENVIAR E RECEBER MENSAGENS
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha o app: ");
		System.out.println(" msn para MSN Messesnger \n tlg para Telegram \n fbc para Facebook Messenger");
		String appEscolhido = scanner.next();
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fcb"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		scanner.close();
	}
}
