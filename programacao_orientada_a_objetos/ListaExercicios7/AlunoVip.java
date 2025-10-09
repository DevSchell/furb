package ListaExercicios7;

public class AlunoVip extends Aluno {
    private double descontoMensalidade;

    public AlunoVip(String nome, int idade, Instrutor instrutor) {
        super(nome, idade, instrutor);
    }

    @Override
    public String getResumo() {
        String resumo = "--------- DADOS DO ALUNO ---------" + "\n";
        resumo += "Nome: " + getNome() + "\n";
        resumo += "Matrícula: " + getMatriula() + "\n";
        resumo += "Idade: " + checarStatusMatricula() + "\n";
        resumo += "Peso: " + getPeso() + "\n";
        resumo += "Altura: " + getAltura() + "\n";
        resumo += "Instrutor: " + getInstrutor() + "\n";
        resumo += "Plano: " + getPlano() + "\n";
        resumo += "Benefícios exclusivos: " + "Treinos personalizados, sala exclusiva" + "\n";
        resumo += "Status matrícula: " + checarStatusMatricula() + "\n";

        return resumo;
    }

    public void setDescontoMensalidade(double descontoMensalidade) {
        this.descontoMensalidade = descontoMensalidade;
    }

    public double getDescontoMensalidade() {
        return descontoMensalidade;
    }

    @Override
    public String toString() {
        String resumo = "--------- DADOS DO ALUNO ---------" + "\n";
        resumo += "Nome: " + getNome() + "\n";
        resumo += "Matrícula: " + getMatriula() + "\n";
        resumo += "Idade: " + checarStatusMatricula() + "\n";
        resumo += "Peso: " + getPeso() + "\n";
        resumo += "Altura: " + getAltura() + "\n";
        resumo += "Instrutor: " + getInstrutor() + "\n";
        resumo += "Plano: " + getPlano() + "\n";
        resumo += "Status matrícula: " + checarStatusMatricula() + "\n";

        return resumo;
    }
}
