package programacao_orientada_a_objetos.ListaExercicios1.Questao3;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        // Pessoa 1
        while (pessoa1.altura <= 0) {
            System.out.println("Informe a altura da pessoa 1: ");
            pessoa1.altura = input.nextDouble();
            if (pessoa1.altura <= 0) {
                System.out.println("A altura informada deve ser maior do que 0");
            }
        }

        while (pessoa1.peso <= 0) {
            System.out.println("Informe o peso da pessoa 1: ");
            pessoa1.peso = input.nextDouble();
            if (pessoa1.peso <= 0) {
                System.out.println("O peso informado deve ser maior do que 0");
            }
        }

        double imcPessoa1 = pessoa1.calcularImc();
        System.out.println("Seu IMC é: " + imcPessoa1);
        System.out.println();

        // Pessoa 2
        while (pessoa2.altura <= 0) {
            System.out.println("Informe a altura da pessoa 2: ");
            pessoa2.altura = input.nextDouble();
            if (pessoa1.altura <= 0) {
                System.out.println("A altura informada deve ser maior do que 0");
            }
        }

        while (pessoa2.peso <= 0) {
            System.out.println("Informe o peso da pessoa 2: ");
            pessoa2.peso = input.nextDouble();
            if (pessoa2.peso <= 0) {
                System.out.println("O peso informado deve ser maior do que 0");
            }
        }

        double imcPessoa2 = pessoa2.calcularImc();
        System.out.println("Seu IMC é: " + imcPessoa2);
        System.out.println();

        // Pessoa 3
        while (pessoa3.altura <= 0) {
            System.out.println("Informe a altura da pessoa 3: ");
            pessoa3.altura = input.nextDouble();
            if (pessoa3.altura <= 0) {
                System.out.println("A altura informada deve ser maior do que 0");
            }
        }

        while (pessoa3.peso <= 0) {
            System.out.println("Informe o peso da pessoa 3: ");
            pessoa3.peso = input.nextDouble();
            if (pessoa3.peso <= 0) {
                System.out.println("O peso informado deve ser maior do que 0");
            }
        }

        double imcPessoa3 = pessoa3.calcularImc();
        System.out.println("Seu IMC é: " + imcPessoa3);
        System.out.println();
        input.close();
    }
}
