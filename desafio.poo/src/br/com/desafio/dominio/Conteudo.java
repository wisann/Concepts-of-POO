package br.com.desafio.dominio;

public abstract class Conteudo {
	protected static final double XP_PADRAO = 10; // the final and static statement makes the "10" value a pattern.
	private String titulo;
	private String descricao;
	
	public abstract double calcularXP(); // the abstract obligates the daughters classes of Conteudo to instantiate this method 
	//with the "Override" annotation 

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