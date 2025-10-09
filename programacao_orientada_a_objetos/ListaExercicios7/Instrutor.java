package ListaExercicios7;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {

    private String nome;
    private String cref;
    private String especialidade;
    private final ArrayList<Aluno> alunos = new ArrayList<>();
    private Instrutor mentor;

    // Construtor
    Instrutor(String nome, String cref, String especialidade) {
        this.nome = nome;
        this.cref = cref;
        this.especialidade = especialidade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getResumo() {
        return "Instrutor: " + getNome() + " | CREF: " + getCref() + " | Especialidade: " + getEspecialidade();
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setMentor(Instrutor mentor) {
        this.mentor = mentor;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCref() {
        return cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Instrutor getMentor() {
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

    public String getResumoCompleto() {
        String resumo = "--------- DADOS DO INSTRUTOR ---------" + "\n";
        resumo += "Nome: " + getNome() + "\n";
        resumo += "Cref: " + getCref() + "\n";
        resumo += "Especialidade: " + getEspecialidade() + "\n";

        if (this.mentor != null) {
            resumo += "Mentor: " + getMentor() + "\n";
        }

        return resumo;
    }

    @Override
    public String toString() {
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
