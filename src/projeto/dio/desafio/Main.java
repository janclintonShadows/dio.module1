package projeto.dio.desafio;

import java.time.LocalDate;

import projeto.dio.d1.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição de Mentoria Java");
		mentoria.setData(LocalDate.now());
		Curso curso1 = new Curso();
		curso1.setTitulo("Java Collections");
		curso1.setDescricao("Curso de Coleções com Java");
		curso1.setCargaHoraria(4);
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript Para Iniciantes");
		curso2.setDescricao("Curso de JavaScript");
		curso2.setCargaHoraria(2);
		/*
		 * System.out.println(mentoria);
		 */
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição de Conteudo Java Bootcamp");
		bootcamp.getConteudo().add(mentoria);
		bootcamp.getConteudo().add(curso1);
		bootcamp.getConteudo().add(curso2);
		
		Devs dev = new Devs();
		dev.setNome("Zeref Shadows");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos "+dev.getConteudosInscritos());
		
		Devs dev2 = new Devs();
		dev2.setNome("Zeref Dragneel");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos "+dev2.getConteudosInscritos());
		dev2.pogredir();
		dev2.pogredir();
		System.out.println("Conteudos Concluidos de "+dev2.getNome()+" -> "+dev2.getConteudosConcluidos()+" XP = "+dev2.calcularTotalXP());
		System.out.println("Conteudos Inscritos "+dev2.getConteudosInscritos());
		System.out.println("Devs inscritos no BootCamp são: "+bootcamp.getDevs());
	}

}
