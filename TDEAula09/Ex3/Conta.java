package TDEs.TDEAula09.Ex3;

public class Conta {
    private double saldo;

    public double getSaldo(){return saldo;}

    public void depositar(double valor){
        if (valor > 0) saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
