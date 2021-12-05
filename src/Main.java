import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Modulo 1");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Modulo 2");
        curso2.setDescricao("Descricao curso React");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Modulo 3");
        curso3.setDescricao("Descricao curso SQL");
        curso3.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Unica");
        mentoria1.setDescricao("Descricao java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //* dev1
        Dev tarcisio = new Dev();
        tarcisio.setNome("Tarcisio");
        tarcisio.insceverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + tarcisio.getConteudosIncritos());
        tarcisio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos" + tarcisio.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + tarcisio.getConteudosIncritos());
        System.out.println("XP:" + tarcisio.calcularTotalXp());

        System.out.println("-------");

        //* dev2
        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.insceverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + camila.getConteudosIncritos());
        camila.progredir();
        camila.progredir();
        camila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos" + camila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + camila.getConteudosIncritos());
        System.out.println("XP:" + camila.calcularTotalXp());
    }
}
