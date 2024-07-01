import java.time.LocalDate;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
	public static void main(String [] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Python");
		curso2.setDescricao("Descrição curso Python");
		curso2.setCargaHoraria(16);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Dominando Java");
		mentoria.setDescricao("Pilares da POO com Java");
		mentoria.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Python com IA");
		mentoria2.setDescricao("Implementando IA comm Python");
		mentoria2.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
//		System.out.println(mentoria2);
		
		Bootcamp bootcamp =  new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Trilha de Aprendizagem Java - Do Zero ao Avançado");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("\nConteúdos inscritos Camila: " + devCamila.getConteudosInscritos());	
		devCamila.progredir();	
		// cada vez que chamarmos esse método, um dos cursos/mentoria em que o dev se inscreveu, sái de inscritos e vai para concluídos
		System.out.println("-=-=-=-=-=");
		System.out.println("\nConteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("\nConteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("-=-=-=-=-=");
		System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
		
		
		
	 }
}
