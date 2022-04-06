package br.com.dio.desaafio.dominio;

public class Curso extends Conteudo{

	int cargaHoraia;
	
	@Override
	public double calcularXp() {
		
		return XP_PADRAO * cargaHoraia;
	}
	
	public Curso() {
		
	}
	public int getCargaHoraia() {
		return cargaHoraia;
	}
	public void setCargaHoraia(int cargaHoraia) {
		this.cargaHoraia = cargaHoraia;
	}
	
	@Override
	public String toString() {
		return "Curso de " + getTitulo() +", Descrição: " + getDescricao() + ", Carga Horaria: " + cargaHoraia;
	}
	
	
}
