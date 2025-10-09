package ListaExercicios7;

import java.util.ArrayList;

/**
 * Representa um plano de treino num sistema de academia.
 * Cada plano possui uma descrição, um nível e um status de atividade.
 */
public class PlanoTreino {
    private String descricao;
    private String nivel;
    private boolean ativo;
    private final ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();

    // Construtores

    /**
     * Construtor para criar um PlanoTreino com dados básicos.
     * O nível é definido como "Nível não informado" por padrão.
     *
     * @param descricao A descrição do plano de treino.
     * @param ativo     O status de atividade do plano (true para ativo, false para
     *                  inativo).
     * @throws IllegalArgumentException se a descrição for nula ou vazia.
     */
    public PlanoTreino(String descricao, boolean ativo) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida. É necessário preencher a descrição");
        } else {
            this.descricao = descricao;
            this.ativo = ativo;
            this.nivel = "Nível não informado";
        }
    }

    /**
     * Construtor para criar um PlanoTreino completo, incluindo o nível.
     *
     * @param descricao A descrição do plano de treino.
     * @param ativo     O status de atividade do plano (true para ativo, false para
     *                  inativo).
     * @param nivel     O nível do plano, onde 1=Iniciante, 2=Intermediário e
     *                  3=Avançado.
     * @throws IllegalArgumentException se a descrição for nula ou vazia.
     */
    public PlanoTreino(String descricao, boolean ativo, int nivel) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida. É necessário preencher a descrição");
        } else {
            this.descricao = descricao;
            this.ativo = ativo;
            setNivel(nivel);
        }
    }

    // Métodos

    /**
     * Define a descrição do plano de treino.
     *
     * @param descricao A nova descrição do plano.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Define o nível do plano de treino com base em um valor numérico.
     *
     * @param nivel O valor numérico do nível (1 para Iniciante, 2 para
     *              Intermediário, 3 para Avançado).
     * @throws IllegalArgumentException se o nível fornecido não estiver entre 1 e
     *                                  3.
     */
    public void setNivel(int nivel) {
        switch (nivel) {
            case 1:
                this.nivel = "Iniciante";
                break;
            case 2:
                this.nivel = "Intermediário";
                break;
            case 3:
                this.nivel = "Avançado";
                break;
            default:
                throw new IllegalArgumentException("Nível inválido. O nível máximo é 3");
        }
    }

    /**
     * Retorna a descrição do plano de treino.
     *
     * @return A descrição do plano.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna o nível do plano de treino.
     *
     * @return O nível do plano (ex: "Iniciante", "Intermediário", "Avançado").
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Verifica e retorna o status de atividade do plano.
     *
     * @return Uma string que indica se o plano está "ativo" ou "inativo".
     */
    public String checarStatus() {
        if (ativo) {
            return "Plano está ativo";
        } else {
            return "Plano está inativo";
        }
    }

    /**
     * Ativa o plano de treino, definindo o status como true.
     */
    public void ativar() {
        ativo = true;
    }

    /**
     * Desativa o plano de treino, definindo o status como false.
     */
    public void desativar() {
        ativo = false;
    }

    public void addExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public void excluirExercicio(Exercicio exercicio) {
        exercicios.remove(exercicio);
    }

    public void getExercicios() {
        for (Exercicio exercicio : exercicios) {
            System.out.println("Nome: " + exercicio.getNome());
            System.out.println("Número de repetições: " + exercicio.getNumeroDeRepeticoes());
            System.out.println("Número de séries: " + exercicio.getNumeroDeSeries());
            System.out.println("Carga: " + exercicio.getCarga());
        }
    }

}