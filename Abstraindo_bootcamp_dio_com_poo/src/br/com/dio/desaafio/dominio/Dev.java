package br.com.dio.desaafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo>conteudoIncritos = new LinkedHashSet<>();
	private Set<Conteudo>conteudosConcluidos = new LinkedHashSet<>();
	
	//Set >> usa-se para reusar conteudos como herança, como e mostrado a cima heradando da classe mãe Conteudos
	
	//LinkedHashSet<>() >> e tipo um array porem salva apenas valores não repetidos e de forma sequencial, um apos o outro.
	
	public void inscreveBootcamp(Bootcamp bootcamp) {
		this.conteudoIncritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoIncritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudoIncritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum contéudo!");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoIncritos() {
		return conteudoIncritos;
	}

	public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
		this.conteudoIncritos = conteudoIncritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
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
		return Objects.equals(conteudoIncritos, other.conteudoIncritos)
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos) && Objects.equals(nome, other.nome);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudoIncritos, conteudosConcluidos, nome);
	}

	
	
	
	
	
}
