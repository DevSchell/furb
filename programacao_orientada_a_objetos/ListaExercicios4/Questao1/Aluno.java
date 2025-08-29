package ListaExercicios4.Questao1;

/**
 * Representa um aluno em um sistema de academia, com seus dados pessoais e status de matrícula.
 * Cada aluno tem um nome, matrícula, idade, peso, altura e um status de matrícula.
 */
public class Aluno {
    private String nome;
    private int matricula;
    private boolean ativo;
    private int idade;
    private double peso;
    private double altura;

    // Variável da classe
    /**
     * Variável estática para controlar o número de matrículas geradas.
     * É incrementada a cada novo aluno criado.
     */
    public static int qtdMatricula = 0;

    // Construtores
    /**
     * Construtor completo para criar um objeto Aluno.
     * Atribui uma nova matrícula automaticamente.
     *
     * @param nome    O nome do aluno.
     * @param ativo   O status inicial da matrícula do aluno (true para ativo, false para inativo).
     * @param idade   A idade do aluno.
     * @param peso    O peso do aluno em kg.
     * @param altura  A altura do aluno em cm.
     * @throws IllegalArgumentException se a idade for um valor negativo.
     */
    public Aluno(String nome, boolean ativo, int idade, double peso, double altura) {
        try {
            if (idade < 0) {
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

    /**
     * Construtor simplificado para criar um objeto Aluno com dados básicos.
     * A matrícula é atribuída automaticamente, e o status 'ativo' é definido como 'true' por padrão.
     * O peso e a altura não são informados neste construtor.
     *
     * @param nome  O nome do aluno.
     * @param idade A idade do aluno.
     * @throws IllegalArgumentException se a idade for um valor negativo.
     */
    public Aluno(String nome, int idade) {
        try {
            if (idade < 0) {
                throw new IllegalArgumentException("A idade não pode ser negativa");
            } else {
                this.nome = nome;
                matricula = qtdMatricula + 1;
                this.ativo = true;
                this.idade = idade;
                // Peso e altura não são definidos aqui.
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Houve um erro: " + e.getMessage());
        }
    }

    // Métodos

    /**
     * Define o nome do aluno.
     *
     * @param nome O novo nome do aluno.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define a idade do aluno.
     *
     * @param idade A nova idade do aluno.
     */
    public void setidade(int idade) {
        this.idade = idade;
    }

    /**
     * Define o peso do aluno.
     *
     * @param peso O novo peso do aluno em kg.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Define a altura do aluno.
     *
     * @param altura A nova altura do aluno em cm.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Retorna o nome do aluno.
     *
     * @return O nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o número de matrícula do aluno.
     *
     * @return O número de matrícula.
     */
    public int getMatriula() {
        return matricula;
    }

    /**
     * Retorna a idade do aluno.
     *
     * @return A idade do aluno.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna o peso do aluno.
     *
     * @return O peso do aluno em kg.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Retorna a altura do aluno.
     *
     * @return A altura do aluno em cm.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Checa o status da matrícula e retorna uma string.
     *
     * @return Uma string "aluno ativo" se a matrícula estiver ativa, ou "aluno inativo" caso contrário.
     */
    public String checarStatusMatricula() {
        if (ativo) {
            return "aluno ativo";
        } else {
            return "aluno inativo";
        }
    }

    /**
     * Desativa a matrícula do aluno.
     */
    public void desativarMatricula() {
        ativo = false;
    }

    /**
     * Ativa a matrícula do aluno.
     */
    public void ativarMatricula() {
        ativo = true;
    }
}