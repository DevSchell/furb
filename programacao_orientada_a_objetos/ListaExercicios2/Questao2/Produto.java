package ListaExercicios2.Questao2;

public class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int estoque;

    // Get
    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }

    int getEstoque() {
        return estoque;
    }

    // Set
    void setNome(String novoNome) {
        nome = novoNome;
    }

    void setPreco(double novoPreco) {
        preco = novoPreco;
    }

    //Usado para "setar" um valor específico de estoque diretamente, sem a adição da função repor()
    void setEstoque(int novoEstoque) {
        if(novoEstoque < 0) {
            System.out.println("Número deve ser positivo");
        } 
        estoque = novoEstoque;
    }

    // Métodos
    void vender(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Não foi possível vender " + quantidade + " unidades de " + getNome() + ". Estoque atual: " + getEstoque());
            return;
        }

        // Se tiver quantidade suficiente no estoque
        estoque = estoque - quantidade;
        System.out.println("Foram vendidas " + quantidade + " unidades de " + getNome());
    }

    void repor(int quantidade) {
        if (quantidade > 0) {
            estoque = estoque + quantidade;
            System.out.println("Novo estoque do produto " + getNome() + " é de: " + getEstoque() + " unidades");
        }
    }
}
