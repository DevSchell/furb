package programacao_orientada_a_objetos.ListaExercicios3.Questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Vetor de funcionários
        Funcionario[] vetorFuncionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            Funcionario funcionario = new Funcionario();

            System.out.println("Informe o nome do funcionário número " + (i + 1) + ": ");
            funcionario.setNome(input.next());

            System.out.println("Informe o salario do funcionário número " + (i + 1) + ": ");
            funcionario.setSalario(input.nextDouble());

            vetorFuncionarios[i] = funcionario;
        }

        for (int i = 0; i < vetorFuncionarios.length; i++) {
            System.out.println("Nome: " + vetorFuncionarios[i].getNome() + " | Salário: R$"
                    + vetorFuncionarios[i].getSalario() + " | IRPF: R$" + vetorFuncionarios[i].calcularIrpf());
        }

        input.close();
    }
}