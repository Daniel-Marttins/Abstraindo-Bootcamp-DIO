import java.time.LocalDate;

import br.com.dio.desaafio.dominio.Bootcamp;
import br.com.dio.desaafio.dominio.Curso;
import br.com.dio.desaafio.dominio.Dev;
import br.com.dio.desaafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso de java");
		curso1.setCargaHoraia(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Python");
		curso2.setDescricao("Descrição do curso de python");
		curso2.setCargaHoraia(11);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria de java");
		mentoria.setData(LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Você irá aprender os melhores conceitos de java aqui!");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devDaniel = new Dev();
		devDaniel.setNome("Daniel");
		devDaniel.inscreveBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Daniel " + devDaniel.getConteudoIncritos());
		
		devDaniel.progredir();
		
		System.out.println("---------");
		
		System.out.println("Conteúdos Inscritos Daniel " + devDaniel.getConteudoIncritos());
		
		System.out.println("Conteúdos Concluidos Daniel " + devDaniel.getConteudosConcluidos());
		System.out.println("XP: " + devDaniel.calcularTotalXp());
		
		
		System.out.println("-----------");
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreveBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila " + devCamila.getConteudoIncritos());
		
		devCamila.progredir();
		
		System.out.println("---------");
		
		System.out.println("Conteúdos Inscritos Daniel " + devDaniel.getConteudoIncritos());
		
		System.out.println("Conteúdos Concluidos Camila " + devDaniel.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		
		
	}

}
