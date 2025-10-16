package ListaExercicios8;

public class ObraPublica extends Obra {
    private String construcaoDataComeco;
    private String construcaoDataFim;

    public void calcularDuracao() {
        //TODO: Must implement
    }

    public String getConstrucaoDataComeco() {
        return construcaoDataComeco;
    }

    public void setConstrucaoDataComeco(String dataComeco) {
        this.construcaoDataComeco = dataComeco;
    }

    public String getConstrucaoDataFim() {
        return construcaoDataFim;
    }

    public void setConstrucaoDataFim(String dataFim) {
        this.construcaoDataFim = dataFim;
    }
}
