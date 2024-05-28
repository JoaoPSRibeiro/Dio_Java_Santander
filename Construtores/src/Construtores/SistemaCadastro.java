package Construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		// criamos um apessoa no sistema
		Pessoa marcos = new Pessoa("123", "Marcos");
		
		//definimos o endereço do Marcos
		marcos.setEndereco("Rua das Marias");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}
}
