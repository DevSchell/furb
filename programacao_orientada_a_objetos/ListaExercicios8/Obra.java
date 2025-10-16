package ListaExercicios8;

import java.util.ArrayList;

public abstract class Obra {

    /// Variables

    private int id;
    private String dataCriacao;
    private String descricao;
    private ArrayList<Profissional> responsaveis;

    /// Getters

    public int getId() {
        return id;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Profissional> getResponsaveis() {
        return responsaveis;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setResponsaveis(ArrayList<Profissional> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public void adicionarResponsavel(Profissional profissional) {
        responsaveis.add(profissional);
    }

    public void removerResponsavel(Profissional profissional) {
        responsaveis.remove(profissional);
    }

}
