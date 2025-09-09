package ListaExercicios5;

import java.util.List;

public class Instrutor {

    private String nome;
    private String cref;
    private String especialidade;
    private List<Aluno> alunos;
    private Instrutor mentor;

    // Construtor
    Instrutor(String nome, String cref, String especialidade) {
        this.nome = nome;
        this.cref = cref;
        this.especialidade = especialidade;
    }

    // Setters
    void setNome(String nome) {
        this.nome = nome;
    }

    void setCref(String cref) {
        this.cref = cref;
    }

    void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    void setMentor(Instrutor instrutor) {
        mentor = instrutor;
    }

    // Getters
    String getNome() {
        return nome;
    }

    String getCref() {
        return cref;
    }

    String getEspecialidade() {
        return especialidade;
    }

    List<Aluno> getAlunos() {
        return alunos;
    }

    Instrutor getMentor() {
        return mentor;
    }

    // Métodos
    void adicionarAluno(Aluno aluno) {
        try {
            if (aluno == null) {
                throw new IllegalArgumentException("Parâmetro de aluno não deve ser nulo");
            }

            alunos.add(aluno);
            System.out.println("Aluno(a) " + aluno.getNome() + " adicionado com sucesso");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void removerAluno(Aluno aluno) {
        try {
            if (aluno == null) {
                throw new IllegalArgumentException("Parâmetro de aluno não deve ser nulo");
            }

            alunos.remove(aluno);
            System.out.println("Aluno(a) " + aluno.getNome() + " removido com sucesso");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    String getResumo() {
        String resumo = "--------- DADOS DO INSTRUTOR ---------" + "\n";
        resumo += "Nome: " + getNome() + "\n";
        resumo += "Cref: " + getCref() + "\n";
        resumo += "Especialidade: " + getEspecialidade() + "\n";

        if (this.mentor != null) {
            resumo += "Mentor: " + getMentor() + "\n";
        }

        return resumo;
    }

}
