import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Dominando Java");
		mentoria1.setDescricao("Pilares da POO com Java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo("Python com IA");
		mentoria2.setDescricao("Implementando IA comm Python");
		mentoria2.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(mentoria2);
	}
}
