package aula;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    public static void main(String[] args) {
        ContaCorrente conta0 = new ContaCorrente();
        conta0.setSaldo(1000);
        conta0.saque(50);
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setSaldo(5000);
        conta1.deposito(200);
        List contasBanco1 = new ArrayList();
        contasBanco1.add(conta0);
        contasBanco1.add(conta1);
        for (int i = 0; i < contasBanco1.size(); i++) {
// tem que forcar o Cast, ja que ArrayList retorna um Object.
            ContaCorrente conta = (ContaCorrente) contasBanco1.get(i);
            System.out.println("Saldo da conta " + i + " eh de R$ " + conta.getSaldo());
        }
        List<ContaCorrente> contasBanco2 = new ArrayList<ContaCorrente>();
        contasBanco2.add(conta0);
        contasBanco2.add(conta1);
// exemplo for norma
        for (int i = 0; i < contasBanco2.size(); i++) {
// tem que forcar o Cast, ja que ArrayList retorna um Object.
            System.out.println("Saldo da conta " + i + " é " + contasBanco2.get(i).getSaldo());
        }
        int i = 0;
// exemplo foreach
        for (ContaCorrente conta : contasBanco2) {
            System.out.println("Saldo de conta " + i + " eh de R$ " + conta.getSaldo());
            i++;
        }
    }
}
