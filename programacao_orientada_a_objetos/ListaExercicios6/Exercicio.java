package ListaExercicios6;

public class Exercicio {
    private String nome;
    private int series;
    private int repeticoes;
    private double carga;

    //Construtores
    Exercicio(String nome, int series, int repeticoes, double carga) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga; 
    }

    //Setters
    void setNome(String nome) {
        this.nome = nome;
    }

    void setSeries(int series) {
        this.series = series;
    }

    void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    void setCarga(double carga) {
        this.carga = carga;
    }

    // Getters
    String getNome() {
        return nome;
    }

    int getNumeroDeSeries() {
        return series;
    }

    int getNumeroDeRepeticoes() {
        return repeticoes;
    }

    double getCarga() {
        return carga;
    }

    String getResumo() {
        String resumo = "------ DADOS DO EXERCÍCIO ------" + "\n";
        resumo += "Nome: " + getNome() + "\n";
        resumo += "Número de séries: " + getNumeroDeSeries() + "\n";
        resumo += "Número de repetições: " + getNumeroDeRepeticoes() + "\n";
        resumo += "Carga: " + getCarga() + "\n";

        return resumo;
    }
}
