package TDEs.TDE06.Ex1;

public class Retangulo {
    double largura;
    double altura;

    Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    double area() {
      return largura * altura;
    };
}
