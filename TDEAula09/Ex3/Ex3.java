package TDEs.TDEAula09.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(200);
        System.out.println("Saque 50 ok? " + conta.sacar(50));
        System.out.println("Saque 500 ok? " + conta.sacar(500));
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
