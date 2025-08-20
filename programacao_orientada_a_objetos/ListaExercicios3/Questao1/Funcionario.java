package programacao_orientada_a_objetos.ListaExercicios3.Questao1;

public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido");
        }
        this.salario = valor;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularIrpf(double salario) {
        double imposto = 0;
        double salarioAtual = salario;

        // 1º Faixa - Imposto isento até R$1903.98
        salarioAtual -= 1903.98;

        // 2º Faixa
        if (salarioAtual > 922.67) {
            imposto += (922.67 * 7.5) / 100;
            salarioAtual -= 922.67;
        } // TODO: criar else

        // 3ºFatia
        if (salarioAtual > 924.39) {
            imposto += (924.39 * 0.15) / 100;
            salarioAtual -= 924.39;
        } //TODO: criar else

        // 4º Fatia
        if(salarioAtual > 313.62) {

        } 

        // 5º Fatia

        // 1º fatia = 0
        // 2º fatia = 922,66
        // 3º fatia = 924,39
        // 4º fatia = 913,62

        return imposto;
    }

}
