package Construtores; 

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
