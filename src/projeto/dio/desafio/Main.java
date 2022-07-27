package projeto.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição de Mentoria Java");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria);
	}

}
