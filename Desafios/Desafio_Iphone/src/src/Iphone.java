package src;

import src.navegadores.safari;
import src.Player.player;
import src.Telefone.telefone;

public class Iphone {	
	public static void main(String[] args) {
		telefone phone = new telefone();
		player tocador = new player();
		safari navegador = new safari();
	
		
		phone.ligar();
		phone.atender();
		phone.iniciarCorreioVoz();
		
		tocador.tocar();
		tocador.pausar();
		tocador.selecionarMusica();
		
		navegador.exibirPagina();
		navegador.atualizarPagina();
		navegador.novaAba();
		
	}
}