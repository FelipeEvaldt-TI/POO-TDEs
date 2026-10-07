package TDEs.TDEAula09.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.setCelsius(22);
        System.out.printf("%.1f C = %.1f F%n", termometro.getCelsius(), termometro.getFahrenheit());
    }
}
