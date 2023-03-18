package br.com.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
	private String nome;
	private List<Conteudo> conteudosInscrito = new ArrayList<>(); // this list holds the amount of courses that the developers subscribed 
	private List<Conteudo> conteudosConcluidos = new ArrayList<>(); // this list shows every course that the developer finished 
	
	// this method allows the developer to start a new course  
	public void inscreverBootcamp(Bootcamp bootcamp) { 
		this.conteudosInscrito.addAll(bootcamp.getConteudo());
		bootcamp.getDevsInscritos().add(this);
		
	}
	public void progredir() { // this method shows the developer progress 
		Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
		if (conteudo.isPresent()) { 
			this.conteudosConcluidos.add(conteudo.get()); // this line adds into the the conteudosConcluido list when a developer makes a prpgress
			this.conteudosInscrito.remove(conteudo.get()); // removes of the conteudosIncritos list the finishes courses
		} else {
			System.out.println("voce não esta matriculado em nenhum conteudo");
		}
		
	}
	public double calcularTotalXP() { // this method takes all finished courses and add certain amount of XP to the developer
		return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conteudo> getConteudosInscrito() {
		return conteudosInscrito;
	}
	public void setConteudosInscrito(List<Conteudo> conteudosInscrito) {
		this.conteudosInscrito = conteudosInscrito;
	}
	public List<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(List<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
}