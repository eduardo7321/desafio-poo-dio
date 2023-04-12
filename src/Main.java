import br.com.dio.desafio.domonio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascropt");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscrevetBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Eduardo:" + devEduardo.getConteudosInscritos());

        devEduardo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Eduardo:" + devEduardo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Eduardo:" + devEduardo.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularTotalXp());

        System.out.println("---------------");

        Dev devTatiane = new Dev();
        devTatiane.setNome("Tatiane");
        devTatiane.inscrevetBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Tatiane:" + devTatiane.getConteudosInscritos());

        devTatiane.progredir();
        devTatiane.progredir();
        devTatiane.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Tatiane:" + devTatiane.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Tatiane:" + devTatiane.getConteudosConcluidos());
        System.out.println("XP:" + devTatiane.calcularTotalXp());

    }
}

