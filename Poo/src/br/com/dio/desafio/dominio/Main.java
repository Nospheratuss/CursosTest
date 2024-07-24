package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java", "Descrição do curso Java", 8);
        Curso cursoPython = new Curso("Curso Python", "Descrição do curso Python", 10);

        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Descrição da mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.addConteudo(cursoJava);
        bootcamp.addConteudo(cursoPython);
        bootcamp.addConteudo(mentoriaJava);

        Dev devMaverick = new Dev("Maverick");
        devMaverick.inscreverBootcamp(bootcamp);
        devMaverick.progredir();
        devMaverick.progredir();

        System.out.println("Conteúdos Inscritos Maverick: " + devMaverick.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maverick: " + devMaverick.getConteudosConcluidos());
        System.out.println("XP: " + devMaverick.calcularTotalXp());

        Dev devAdolfo = new Dev("Adolfo");
        devAdolfo.inscreverBootcamp(bootcamp);
        devAdolfo.progredir();
        devAdolfo.progredir();
        devAdolfo.progredir();

        System.out.println("Conteúdos Inscritos Adolfo: " + devAdolfo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Adolfo: " + devAdolfo.getConteudosConcluidos());
        System.out.println("XP: " + devAdolfo.calcularTotalXp());

        // Nova funcionalidade: Remover conteúdo do bootcamp
        bootcamp.removeConteudo(cursoPython);
        System.out.println("Conteúdos do Bootcamp após remoção: " + bootcamp.getConteudos());
    }
}
