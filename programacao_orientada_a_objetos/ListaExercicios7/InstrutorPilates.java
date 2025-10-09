package ListaExercicios7;

public class InstrutorPilates extends Instrutor {
    InstrutorPilates(String nome, String cref, String especialidade) {
        super(nome, cref, especialidade);
    }

    public String getResumoCompleto() {
        String resumo = "--------- DADOS DO INSTRUTOR ---------" + "\n";
        resumo += "Nome: " + getNome() + "\n";
        resumo += "Cref: " + getCref() + "\n";
        resumo += "Instrutor especializado em exercícios de pilates";

        if (this.getMentor() != null) {
            resumo += "Mentor: " + getMentor() + "\n";
        }

        return resumo;
    }
}
