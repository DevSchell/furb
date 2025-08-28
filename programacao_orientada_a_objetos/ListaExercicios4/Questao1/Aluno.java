package ListaExercicios4.Questao1;

public class Aluno {
    private String nome;
    private int matricula;
    private boolean ativo;
    private int idade;
    private double peso;
    private double altura;

    // Variável da classe
    public static int qtdMatricula = 0;

    // Construtores
    Aluno(String nome, boolean ativo, int idade, double peso, double altura) {
        try {
            if(idade < 0) {
                throw new IllegalArgumentException("A idade não pode ser negativa");
            } else {
                this.nome = nome;
                matricula = qtdMatricula + 1;
                this.ativo = ativo;
                this.idade = idade;
                this.peso = peso;
                this.altura = altura;

                qtdMatricula++;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Houve um erro: " + e.getMessage());
        }
    }

    Aluno(String nome, int idade) {
        try {
            if(idade < 0) {
                throw new IllegalArgumentException("A idade não pode ser negativa");
            } else {
                this.nome = nome;
                matricula = qtdMatricula + 1;
                this.ativo = true;
                this.idade = idade;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Houve um erro: " + e.getMessage());
        }
    }

    // Métodos

}
