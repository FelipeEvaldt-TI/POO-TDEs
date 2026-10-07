package TDEs.TDEAula09.Ex4;

public class Termometro {
    private double celsius;

    public void setCelsius(double celsius) {this.celsius = celsius;}

    public double getCelsius() {
        return celsius;
    }
    public double getFahrenheit() {return celsius * 9 / 5 + 32;}
}
