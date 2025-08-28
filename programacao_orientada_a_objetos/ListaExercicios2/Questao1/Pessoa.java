package ListaExercicios2.Questao1;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    //Ações
    double calcularImc() {
        return peso / (altura * altura);
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Getters
    public String getNome() {
        return this.nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

}
