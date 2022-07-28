package projeto.dio.d1;

import java.util.Objects;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.time.LocalDate;
import projeto.dio.desafio.Conteudo;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Devs> devs = new HashSet<Devs>();
	private Set<Conteudo> conteudo = new LinkedHashSet<Conteudo>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descrcao) {
		this.descricao = descrcao;
	}
	public Set<Devs> getDevs() {
		return devs;
	}
	public void setDevs(Set<Devs> devs) {
		this.devs = devs;
	}
	public Set<Conteudo> getConteudo() {
		return conteudo;
	}
	public void setConteudo(Set<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudo, dataFinal, dataInicial, descricao, devs, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devs, other.devs) && Objects.equals(nome, other.nome);
	}
	
	
}
