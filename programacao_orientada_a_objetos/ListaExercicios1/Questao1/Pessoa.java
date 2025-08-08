package programacao_orientada_a_objetos.ListaExercicios1.Questao1;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
