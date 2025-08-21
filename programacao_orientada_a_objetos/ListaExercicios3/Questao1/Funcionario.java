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
            return;
        }
        this.salario = valor;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularIrpf() {
        double salarioParaCalcular = this.salario;
        double imposto = 0;

        // Limites das faixas
        final double faixa1_limite = 1903.98;
        final double faixa2_limite = 2826.65;
        final double faixa3_limite = 3751.05;
        final double faixa4_limite = 4664.68;



        // Se o salário for menor ou igual à faixa isenta, o imposto é zero.
        if (salarioParaCalcular <= faixa1_limite) {
            return 0;
        }

        // 2ª Faixa: 7.5% sobre a diferença de 1903.99 até 2826.65 (que é 922.67)
        //Math.min pega o menor valor, pra confirmar que se o salario ser menor q limite da faixa, ele pega o salario e não mais
        double valorTributavel2 = Math.min(salarioParaCalcular - faixa1_limite, (faixa2_limite - faixa1_limite));
        imposto += valorTributavel2 * 0.075;

        // 3ª Faixa: 15% sobre a diferença de 2826.66 até 3751.05 (que é 924.4)
        if (salarioParaCalcular > faixa2_limite) {
            double valorTributavel3 = Math.min(salarioParaCalcular - faixa2_limite, (faixa3_limite - faixa2_limite));
            imposto += valorTributavel3 * 0.15;
        }
        
        // 4ª Faixa: 22.5% sobre a diferença de 3751.06 até 4664.68 (que é 913.62)
        if (salarioParaCalcular > faixa3_limite) {
            double valorTributavel4 = Math.min(salarioParaCalcular - faixa3_limite, (faixa4_limite - faixa3_limite));
            imposto += valorTributavel4 * 0.225;
        }

        // 5ª Faixa: 27.5% sobre o que exceder 4664.68
        if (salarioParaCalcular > faixa4_limite) {
            double valorTributavel5 = salarioParaCalcular - faixa4_limite;
            imposto += valorTributavel5 * 0.275;
        }

        return imposto;
    }

}



