package desafio_poo;

import java.time.LocalDate;

import desafio_poo.br.com.dio.desafio.dominio.Bootcamp;
import desafio_poo.br.com.dio.desafio.dominio.Course;
import desafio_poo.br.com.dio.desafio.dominio.Dev;
import desafio_poo.br.com.dio.desafio.dominio.Mentoring;

public class Main {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setTitle("Java básico");
		course1.setDescription("Aprenda java do zero!");
		course1.setWorkload(8);

		Course course2 = new Course();
		course2.setTitle("Git e GitHub");
		course2.setDescription("Versione seus primeiros projetos utilizando git e github.");
		course2.setWorkload(4);

		Mentoring mentoring = new Mentoring();
		mentoring.setTitle("mentoria de java");
		mentoring.setDescription("Mentoria com foco em fazer você dar os primeiros e segundos passos com Java!");
		mentoring.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Claro Java Spring");
		bootcamp.setDescription(
				"Bootcamp onde você vai aprender desde o java básico até aplicações com Java Spring. Além de conteúdos extras como versionamento de código e banco de dados!");
		bootcamp.getContents().add(course1);
		bootcamp.getContents().add(course2);
		bootcamp.getContents().add(mentoring);

		Dev dev = new Dev();
		dev.setName("Marcos");
		dev.bootcampRegister(bootcamp);
		System.out.println("Conteúdos iscritos por Marcos:" + dev.getContentsRegistered());
		dev.advance();
		dev.advance();
		System.out.println("-");
		System.out.println("Conteúdos iscritos por Marcos:" + dev.getContentsRegistered());
		System.out.println("Conteúdos concluídos por Marcos:" + dev.getCompletedContents());
		System.out.println("XP:" + dev.calcXPTotal());

	}

}
