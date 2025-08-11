package programacao_orientada_a_objetos.ListaExercicios1.Questao2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        Pessoa user = new Pessoa();

        while (user.peso <= 0) {
            System.out.println("Informe o seu peso em kg: ");
            user.peso = input.nextDouble();
            if (user.peso <= 0) {
                System.out.println("O peso informado deve ser maior do que zero");
            }
        }

        while (user.altura <= 0) {
            System.out.println("Informe a sua altura em metros: ");
            user.altura = input.nextDouble();
            if (user.altura <= 0) {
                System.out.println("A altura informada deve ser maior do que zero");
            }
        }

        double imc = user.calcularImc();

        System.out.println("Seu IMC é: " + imc);
        input.close();
    }
}
