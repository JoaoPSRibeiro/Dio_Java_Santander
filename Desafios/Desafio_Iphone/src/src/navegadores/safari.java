package src.navegadores;

public class safari implements NavegadorInternet{
	 public void exibirPagina() {
		 System.out.println("Conteúdo da Página.");
	 }
	 public void novaAba() {
		 System.out.println("Aba em branco.");
	 }
	 public void atualizarPagina() {
		 System.out.println("Recarregando.");
	 }
}
