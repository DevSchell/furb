package ListaExercicios7;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    //TODO: resolver a parada do construtor
    Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract String getResumo();

}