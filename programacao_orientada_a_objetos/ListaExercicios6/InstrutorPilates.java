package ListaExercicios6;

public class InstrutorPilates extends Instrutor {
    InstrutorPilates(String nome, String cref, String especialidade) {
        super(nome, cref, especialidade);
    }

    @Override
    String getResumo() {
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
