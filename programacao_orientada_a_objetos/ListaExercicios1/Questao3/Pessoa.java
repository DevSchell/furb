package programacao_orientada_a_objetos.ListaExercicios1.Questao3;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
