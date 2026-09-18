package TDEs.TDE06.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        conta.sacar(10);
        System.out.println("Saldo: " + conta.saldo);
        conta.sacar(200);
    }
}
