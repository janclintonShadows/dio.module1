package projeto.dio.desafio;

public class Curso extends Conteudo{
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		return XP_PADRAO * 2;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
}
