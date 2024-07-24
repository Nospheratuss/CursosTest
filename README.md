# Desafio Dio - Sistema de Bootcamp

Este projeto é uma implementação de um sistema de Bootcamp em Java, baseado na estrutura fornecida. Ele permite gerenciar cursos, mentorias e desenvolvedores inscritos, bem como acompanhar o progresso dos desenvolvedores nos conteúdos oferecidos.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `Conteudo.java`: Classe abstrata que define os métodos e atributos comuns a todos os conteúdos (cursos e mentorias).
- `Curso.java`: Subclasse de `Conteudo` que representa um curso.
- `Mentoria.java`: Subclasse de `Conteudo` que representa uma mentoria.
- `Bootcamp.java`: Classe que representa um bootcamp, contendo vários conteúdos e desenvolvedores inscritos.
- `Dev.java`: Classe que representa um desenvolvedor, contendo os conteúdos inscritos e concluídos.
- `Main.java`: Classe principal que contém o método `main` para execução do programa.

## Funcionalidades

- **Gerenciamento de Cursos e Mentorias**: Adição e remoção de cursos e mentorias dentro do bootcamp.
- **Inscrição de Desenvolvedores**: Inscrição de desenvolvedores em bootcamps e progresso nos conteúdos.
- **Cálculo de XP**: Cálculo do XP total adquirido pelos desenvolvedores ao concluírem os conteúdos.

## Implementações

### Conteudo.java

```java
package br.com.dio.desafio.dominio;

import java.util.Objects;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(titulo, conteudo.titulo) && Objects.equals(descricao, conteudo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao);
    }
}
