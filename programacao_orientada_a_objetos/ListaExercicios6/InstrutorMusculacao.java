package ListaExercicios6;

public class InstrutorMusculacao extends Instrutor {

    InstrutorMusculacao(String nome, String cref, String especialidade) {
        super(nome, cref, especialidade);
    }

    @Override
    String getResumo() {
        String resumo = "--------- DADOS DO INSTRUTOR ---------" + "\n";
        resumo += "Nome: " + getNome() + "\n";
        resumo += "Cref: " + getCref() + "\n";
        resumo += "Instrutor especializado exercícios de hipertrofia muscular";

        if (this.getMentor() != null) {
            resumo += "Mentor: " + getMentor() + "\n";
        }

        return resumo;
    }
}
