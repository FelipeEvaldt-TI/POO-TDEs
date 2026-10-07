package TDEs.TDEAula09.Ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Operacoes: D valor | S valor | F para fim");
        while (true){
            String operacao = sc.next();
            if (operacao.equalsIgnoreCase("F")) break;
            double valor = sc.nextDouble();
            if (operacao.equalsIgnoreCase("D")) conta.depositar(valor);
            else if (operacao.equalsIgnoreCase("S"))
                if (!conta.sacar(valor)) System.out.println("Saque negado");
        }
        System.out.printf("Saldo final: R$ %.2f%n", conta.getSaldo());
    }
}
