package programacao_orientada_a_objetos.ListaExercicios1.Questao4;

public class Pessoa {
    String nome;
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
