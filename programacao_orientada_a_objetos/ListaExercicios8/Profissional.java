package ListaExercicios8;

public class Profissional implements Relatorio{
    // Attributes
    private String nomeCompleto;
    private String cpf;
    private String telefone;

    // Getters and Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Methods

    @Override
    public void gerarRelatorioCompleto() {
        //TODO: implement method...
    }

    @Override
    public void gerarRelatorioPorTipo() {
        //TODO: implement method...
    }

    @Override
    public void gerarRelatorioPorProfissional() {
        //TODO: implement method...
    }

    @Override
    public void gerarRelatorioResumido() {
        //TODO: implement method...
    }
}
