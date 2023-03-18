package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicio = LocalDate.now(); // will automatically print the date that the user starts a course
	private LocalDate dataFinal = dataInicio.plusDays(45); // adds 45 days to the dataInicio variable;
	private List <Dev> devsInscritos = new ArrayList<>(); // created a list to store the amount of developers subscribed  
	private List <Conteudo> conteudo = new ArrayList<>(); // a list that stores the content of the courses 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public List<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(List<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public List<Conteudo> getConteudo() {
		return conteudo;
	}
	public void setConteudo(List<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	

}