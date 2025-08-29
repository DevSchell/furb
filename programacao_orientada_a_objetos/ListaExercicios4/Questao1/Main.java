package ListaExercicios4.Questao1;

/**
 * A classe Main é o ponto de entrada do programa.
 * Ela é usada para criar e testar objetos das classes Aluno e PlanoTreino,
 * conforme os requisitos da atividade.
 */
public class Main {
    
    /**
     * O método principal que inicia a execução do programa.
     * Ele demonstra a criação de objetos, a chamada de seus métodos
     * e o tratamento de exceções.
     *
     */
    public static void main(String[] args) {
        // Criando 2 objetos Aluno
        Aluno aluno1 = new Aluno("Leonardo Schell", false, 23, 103, 178);
        Aluno aluno2 = new Aluno("Raphael Sanzattio", 25);

        System.out.println("-------ALUNO 1-------");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatriula());
        System.out.println("Status: " + aluno1.checarStatusMatricula());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Peso: " + aluno1.getPeso() + "kg");
        System.out.println("Altura: " + aluno1.getAltura() + "cm");
        System.out.println();

        System.out.println("-------ALUNO 2-------");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatriula());
        System.out.println("Status: " + aluno2.checarStatusMatricula());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Peso: " + aluno2.getPeso() + "kg");
        System.out.println("Altura: " + aluno2.getAltura() + "cm");
        System.out.println();

        // Criando 2 objetos PlanoTreino
        PlanoTreino plano1 = new PlanoTreino("Plano mensal", true);
        PlanoTreino plano2 = new PlanoTreino("Plano semestral", true, 1);

        System.out.println("------- PLANO 1 -------");
        System.out.println("Descrição: " + plano1.getDescricao());
        System.out.println("Nível: " + plano1.getNivel());
        System.out.println("Status: " + plano1.checarStatus());
        System.out.println();

        System.out.println("------- PLANO 2 -------");
        System.out.println("Descrição: " + plano2.getDescricao());
        System.out.println("Nível: " + plano2.getNivel());
        System.out.println("Status: " + plano2.checarStatus());
        System.out.println();

        // Tentando criar aluno com idade negativa para testar a exceção
        try {
            Aluno aluno3 = new Aluno("Gerônimo", -5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Tentando criar plano de treino com descrição nula para testar a exceção
        try {
            PlanoTreino plano3 = new PlanoTreino(null, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Houve um erro: " + e.getMessage());
        }
    }
}