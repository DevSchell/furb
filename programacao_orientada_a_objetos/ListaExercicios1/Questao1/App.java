package programacao_orientada_a_objetos.ListaExercicios1.Questao1;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 78;

        double imc = pessoa.calcularImc();
        System.out.println("IMC: " + imc);
    }
}
