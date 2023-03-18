package desafio.poo;

import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;
//* main class, it's where the program will be executed 
//*basic concepts of POO

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso(); // instantiation of the Curso class 
		curso.setCargaHoraria(8); // setting values to the variables
		curso.setTitulo("curso jv");
		curso.setDescricao("descrição curso java");
		Curso curso1 = new Curso(); // another instantiation
		curso1.setCargaHoraria(9); // including values to the variables with 'set'
		curso1.setDescricao("curso java 2");// including values to the variables with 'set'
		curso1.setTitulo("Java2");// including values to the variables with 'set'
		
		Mentoria mentoria = new Mentoria();
		mentoria.setData(LocalDate.now());
		mentoria.setTitulo("mentoria");
		mentoria.setDescricao("mentoria descricao");
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("curso java");
		bootcamp.getConteudo().add(curso); // adding a course to the bootcamp class
		bootcamp.getConteudo().add(curso1);
		bootcamp.getConteudo().add(mentoria);
		
		Dev wisanDev = new Dev(); // creating a dev
		wisanDev.setNome("wisan"); // giving a name to the dev
		wisanDev.inscreverBootcamp(bootcamp); // subscribing the developer to the bootcamp 
		System.out.println("Conteudos inscritos de wisan" + wisanDev.getConteudosInscrito()); // printing the courses that the developer is doing
		wisanDev.progredir(); // showing my progress 
		System.out.println("--");
		System.out.println("Conteudos inscritos " + wisanDev.getConteudosInscrito()); // printing the courses after developer progress
		System.out.println("Conteudos concluidos " + wisanDev.getConteudosConcluidos()); // printing all the courses that the developer finished
		System.out.println("XP: " + wisanDev.calcularTotalXP()); // printing the total xp the developer acquired finishing the course
		System.out.println("-------------");
		Dev joaoDev = new Dev();
		joaoDev.setNome("joao");
		joaoDev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de joao " + joaoDev.getConteudosInscrito());
		joaoDev.progredir();
		joaoDev.progredir();
		joaoDev.progredir();
		System.out.println("--");
		System.out.println("Conteudos inscritos " + joaoDev.getConteudosInscrito());
		System.out.println("Conteudos concluidos " + joaoDev.getConteudosConcluidos());
		System.out.println("XP: " + joaoDev.calcularTotalXP());
				

	
			
	}



}


