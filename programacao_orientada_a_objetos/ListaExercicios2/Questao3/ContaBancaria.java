package programacao_orientada_a_objetos.ListaExercicios2.Questao3;

public class ContaBancaria {
    // Atributos
    private String numero;
    private String titular;
    private double saldo;

    // Métodos
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor < 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. O novo saldo é de: R$" + getSaldo());
        } else {
            System.out.println("Depósito não realizado. Valor depositado deve ser um valor maior que 0.");
        }
    }

    public void sacar(double valor) {
        if(valor < 0) {
            System.out.println("Saque não realizado. Valor para ser sacado deve ser maior que 0");
            return;
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso! Saldo atual é de: R$" + getSaldo());
    }
    
    public void transferir(ContaBancaria contaDestino, double valor) {
        if(contaDestino == null) {
            System.out.println("Conta destino não existe, por favor informe uma conta válida.");
            return;
        }

        if(valor < 0 ) {
            System.out.println("Transferência falhou. Valor deve ser maior do que 0");
            return;
        }

        

    }
}
