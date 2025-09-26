package ListaExercicios6;

public class Main {
    public static void main(String[] args) {
        /// Criar 2 instrutores
        Instrutor instrutor1 = new Instrutor("Álvaro", "1", "Musculação");
        Instrutor instrutor2 = new Instrutor("Ângela", "2", "Crossfit");

        /// Criar um aluno normal
        Aluno aluno1 = new Aluno("Leonardo Schell", 23, instrutor1);
        instrutor1.adicionarAluno(aluno1); //Add aluno na lista de alunos do instrutor

        Aluno aluno2 = new Aluno("Guilherme Bolaños", 44, instrutor2);
        instrutor2.adicionarAluno(aluno2); //Add aluno na lista de alunos do instrutor

        /// Criar 2 planos de treino, 1 seca barriga e outro de hipertrofia
        PlanoTreino plano1 = new PlanoTreino("Plano de Hipertrofia 1", true);
        PlanoTreino plano2 = new PlanoTreino("Plano de Flexibilidade 1", true);

        /// Associações de planosTreino() com Exercício()
        Exercicio hipertrofia1 = new Exercicio("Supino Reto com Halteres", 4, 8, 20.5);
        Exercicio hipertrofia2 = new Exercicio("Agachamento Livre", 4, 10, 60.0);
        plano1.addExercicio(hipertrofia1);
        plano1.addExercicio(hipertrofia2);

        Exercicio pilates1 = new Exercicio("The Hundred", 1, 10, 0);
        Exercicio pilates2 = new Exercicio("Roll Up", 1, 8, 0);
        plano2.addExercicio(pilates1);
        plano2.addExercicio(pilates2);

        /// Teste de instrutor especializado
        InstrutorMusculacao instrutorMusculacao = new InstrutorMusculacao("Raphael", "3", "Musculação");
        InstrutorPilates instrutorPilates = new InstrutorPilates("Ayla", "4", "Pilates");

        /// Criar um AlunoVip()
        AlunoVip alunoVip = new AlunoVip("Quico", 18, instrutorMusculacao);
        alunoVip.setDescontoMensalidade(20);

        /// Print diretamente de Aluno e AlunoVip
        System.out.println(aluno1);
        System.out.println(alunoVip);
        System.out.println(alunoVip.getDescontoMensalidade());
    }
}
