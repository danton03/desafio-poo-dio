import java.time.LocalDate;

import edu.danton.desafio.dominio.Bootcamp;
import edu.danton.desafio.dominio.Curso;
import edu.danton.desafio.dominio.Dev;
import edu.danton.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("============== Bootcamp DIO ==============");
        System.out.println("Visão geral:");
        System.out.println(bootcamp);
        System.out.println("Cursos:");
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println("Mentorias:");
        System.out.println(mentoria);
        System.out.println("==========================================");
        System.out.println("Minhas stats:\nInformações");

        Dev devDanton = new Dev();
        devDanton.setNome("Danton");
        devDanton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Danton:" + devDanton.getConteudosInscritos());
        devDanton.progredir();
        devDanton.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Danton:" + devDanton.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Danton:" + devDanton.getConteudosConcluidos());
        System.out.println("XP:" + devDanton.calcularTotalXp());

        System.out.println("-------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Matheus:" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());
    }
}
