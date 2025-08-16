package programacao_orientada_a_objetos.ListaExercicios2.Questao3;

public class ContaBancaria {
    // Atributos
    private String numero;
    private String titular;
    private double saldo;

    // Métodos
    // 1. "Método getNumero() deve ser getter da variável numero"
    public String getNumero() {
        return numero;
    }

    // 2. "setNumero() deve ser setter da variável numero"
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // 3. "getTitular() deve ser getter da var titular"
    public String getTitular() {
        return titular;
    }

    // 4. "setTitular() deve ser setter da var titular"
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // 5. "getSaldo() deve ser getter da var saldo"
    public double getSaldo() {
        return saldo;
    }

    // 6.1 "depositar() deve acresentar valores à var saldo."
    // 6.2 "Método depositar() deve recusar valores negativos"
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. O novo saldo é de: R$" + getSaldo());
        } else {
            System.out.println("Depósito não realizado. Valor depositado deve ser um valor maior que 0.");
        }
    }

    // 7.1 "sacar() deve subtrair valor do saldo"
    // 7.2 "sacar() deve recusar valores negativos"
    // 7.3 "sacar() deve recusar quando valor for maior do que o saldo"
    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Saque não realizado. Valor para ser sacado deve ser maior que 0");
            return;
        }

        if (valor > getSaldo()) {
            System.out.println("Saque não realizado. Valor é requisitado é maior do que o saldo atual.");
            System.out.println("Saldo atual: R$" + getSaldo());
            System.out.println();
            return;
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso! Saldo atual é de: R$" + getSaldo());
        System.out.println();
    }

    // 8. "transferir() deve passar valores de uma conta à outra"
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (contaDestino == null) {
            System.out.println("Conta destino não existe, por favor informe uma conta válida.");
            return;
        }

        if (valor < 0) {
            System.out.println("Transferência falhou. Valor deve ser maior do que 0");
            return;
        }

    }
}
