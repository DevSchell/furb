package programacao_orientada_a_objetos.ListaExercicios3.Questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criando vetor
        Livro[] livros = new Livro[3];

        // Declarando objetos
        Livro livro1 = new Livro("A Sombra do Dragrão", "Elara Vance", 2018);
        Livro livro2 = new Livro("O Enigma da Mansão Silenciosa", "Arthur Blackwood", 2012);
        Livro livro3 = new Livro();

        // Armazenando em vetor
        livros[0] = livro1;
        livros[1] = livro2;
        livros[2] = livro3;

        // Informações completas de todos os livros
        System.out.println(livros[0].exibirInfo());
        System.out.println(livros[1].exibirInfo());
        System.out.println(livros[2].exibirInfo());

        // Quantidade de livros cadastrados
        System.out.println("Quantidade de livros cadastrados: " + Livro.getTotalLivros());

        // Exibição resumida usando sobrecarga
        System.out.println(livro2.exibirInfo(true));

        input.close();
    }
}
