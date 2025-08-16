package programacao_orientada_a_objetos.ListaExercicios2.Questao3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        // Criando objetos ContaBancaria
        System.out.println("Insira o numero da conta 1: ");
        conta1.setNumero(input.next());

        System.out.println("Insira o nome do titular da conta 1:");
        conta1.setTitular(input.next());

        System.out.println("Insira o numero da conta 2: ");
        conta2.setNumero(input.next());

        System.out.println("Insira o nome do titular da conta 2:");
        conta2.setTitular(input.next());

        // a. Operações de depósito na conta1, R$1000 e R$700
        conta1.depositar(1000);
        conta1.depositar(700);

        // b. Operações de depósito conta2, R$5.000
        conta2.depositar(5000);

        // c. Saque na conta 2, R$3.000
        conta2.sacar(3.000);

        // d. Transferência de R$1.800 da conta2 para a conta1
        conta2.transferir(conta1, 1800);

        // Tentando limpar o console com gambiarra
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        // e. Exibir titular de cada conta com o respectivo saldo
        System.out.println("Resultado final");
        System.out.println("Titular: " + conta1.getTitular() + " | Saldo: R$" + conta1.getSaldo());
        System.out.println("Titular: " + conta2.getTitular() + " | Saldo: R$" + conta2.getSaldo());

        input.close();
    }

}
