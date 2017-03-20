package aula;

public class ContaCorrente {

    private double saldo;

    public void deposito(double valor) {
        System.out.println("Deposito de: " + valor + ".");
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        System.out.println("Saque de: " + valor + ".");
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
