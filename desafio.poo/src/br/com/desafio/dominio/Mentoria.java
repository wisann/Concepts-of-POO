package br.com.desafio.dominio;

import java.time.LocalDate;
//extends annotation is showing that the Mentoria class is a daughter of Conteudo class.
public class Mentoria extends Conteudo{
	
	private LocalDate data; // the only attribute that the Conteudo class doesn't contain 
	
	public Mentoria() {}
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria  descricao " + getDescricao() + " titulo " + getTitulo() + " data " + data;
	}
	// the subscribed method of the mother class
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20; // this change its exclusive of this class
	}
	
	
}
