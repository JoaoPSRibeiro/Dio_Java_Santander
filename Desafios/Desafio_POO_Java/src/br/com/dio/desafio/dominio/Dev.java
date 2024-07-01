package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	// conforme for concluindo vai organizando e não permite duplicata
	// caso não tivéssemos criado a classe mãe (Conteudo), teríamos que criar um SET pra cursos e um SET para mentoria, tando inscrito quanto concluiudos.... muitas linhas a mais!!!

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevInscritos().add(this);
		// estamos pegando o set de conteudos inscritos e adicionando no bootcamp
		// pegamos o dev inscrito e adicionamos ao bootcamp
		
		
	}
	// quando esse método for chamado e for informado qual o bootcamp, deve estará inscrito
	
	public void progredir () {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum Conteúdo.");
		}
	}
	// a medida que progredirmos no bootcamp, este método será chamado 
	//OPtioal resolve os restorno Null's
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
				// pegamos cada conteudo de dentro dos conteudos concluidos e pegamos o xp de cada conteudo concluido e somamos
		
	}
	// ao terminar, este método será chamado para calcular o xp total

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}

	

}
