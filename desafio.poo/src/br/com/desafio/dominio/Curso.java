package br.com.desafio.dominio;
// this class also inherit from Conteudo class
public class Curso extends Conteudo{
	
	private int cargaHoraria; // the only attribute that the mother class doesn't contain 
	
	public Curso() {}
	public Curso(String titulo, String descricao, int cargaHoraria) {
	
		this.cargaHoraria = cargaHoraria;
	}

	

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso titulo " + getTitulo() + ", descricao " + getDescricao() + ", cargaHoraria " + cargaHoraria;
	}
	@Override
	public double calcularXP() { // the inherited the method of the mother class 
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}}
	