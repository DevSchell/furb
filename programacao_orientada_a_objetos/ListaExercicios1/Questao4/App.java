package ListaExercicios1.Questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        List<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        // Pessoa 1
        System.out.println("Informe o nome da primeira pessoa: ");
        pessoa1.nome = input.nextLine();

        System.out.println("Informe o peso de " + pessoa1.nome + ": ");
        pessoa1.peso = input.nextDouble();
        input.nextLine();

        System.out.println("Informe a altura de " + pessoa1.nome + ": ");
        pessoa1.altura = input.nextDouble();
        input.nextLine();

        listaPessoas.add(pessoa1);

        // Pessoa 2
        System.out.println("Informe o nome da segunda pessoa: ");
        pessoa2.nome = input.nextLine();

        System.out.println("Informe o peso de " + pessoa2.nome + ": ");
        pessoa2.peso = input.nextDouble();
        input.nextLine();

        System.out.println("Informe a altura de " + pessoa2.nome + ": ");
        pessoa2.altura = input.nextDouble();
        input.nextLine();

        listaPessoas.add(pessoa2);

        // Pessoa 3
        System.out.println("Informe o nome da terceira pessoa: ");
        pessoa3.nome = input.nextLine();

        System.out.println("Informe o peso de " + pessoa3.nome + ": ");
        pessoa3.peso = input.nextDouble();
        input.nextLine();

        System.out.println("Informe a altura de " + pessoa3.nome + ": ");
        pessoa3.altura = input.nextDouble();
        input.nextLine();

        listaPessoas.add(pessoa3);

        for (int i = listaPessoas.size(); i > 0; i--) {
            System.out.println();
            System.out.println("Nome: " + listaPessoas.get(i - 1).nome);
            System.out.println("Peso: " + listaPessoas.get(i - 1).peso + "kg");
            System.out.println("Altura: " + listaPessoas.get(i - 1).altura + " cm");
            System.out.println("Seu IMC é de: " + listaPessoas.get(i - 1).calcularImc());
            System.out.println();
        }
        input.close();
    }
}
