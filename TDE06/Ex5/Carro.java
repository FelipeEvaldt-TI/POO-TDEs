package TDEs.TDE06.Ex5;

public class Carro {
    String marca, modelo;
    int ano;

    Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    String descricao(){
        return marca + " " + modelo + " (" + ano + ")";
    }
}
