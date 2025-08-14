package programacao_orientada_a_objetos.ListaExercicios2.Questao2;

public class App {
    public static void main(String[] args) {
        // 1. Criação de um produto
        System.out.println("Simulação 1: criando o produto...");
        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPreco(5.50);
        produto.repor(15);
        System.out.println();

        // 2. Vendendo o produto, quantidade dentro de estoque
        System.out.println("Simulação 2: vendendo o produto...");
        produto.vender(5);
        System.out.println();

        // 3. Vendendo produto, quantidade fora de estoque
        System.out.println("Simulação 3: vendendo mais produtos do que tem no estoque");
        produto.vender(200);
        System.out.println();

        // 4. Repondo estoque
        System.out.println("Simulação 4: repondo estoque");
        produto.repor(20);
        System.out.println();
    }
}
