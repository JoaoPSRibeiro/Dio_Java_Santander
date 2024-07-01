package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	// não poderemos instanciar conteúdo
	// vamos implementar os atributos nas classes filhas
	
	protected static final double XP_PADRAO = 10d;
	// final (e as letras maisculas demosntram que isso é uma constante e não uma variável, ou seja, é imutável
	// somente os filhos de conteúdo terão acesso ao XP_PADRAO
	
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
