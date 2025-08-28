package ListaExercicios3.Questao2;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Variáveis de classe
    private static int totalLivros;

    // Métodos
    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;

        totalLivros++;
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        anoPublicacao = ano;

        totalLivros++;
    }

    public String exibirInfo() {
        return "Título: " + titulo + " | Autor(a): " + autor + " | Ano de publicação: " + anoPublicacao;
    }

    public String exibirInfo(boolean resumido) {
        if (resumido == true) {
            return "Título: " + titulo;
        } else {
            return "Título: " + titulo + " | Autor(a): " + autor + " | Ano de publicação: " + anoPublicacao;
        }
    }

    public static int getTotalLivros() {
        return totalLivros;
    }

}
