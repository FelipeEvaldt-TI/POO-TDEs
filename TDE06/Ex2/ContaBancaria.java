package TDEs.TDE06.Ex2;

public class ContaBancaria {
    double saldo;

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
