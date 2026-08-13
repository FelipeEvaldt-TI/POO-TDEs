package TDEs.TDE02;
import java.util.Scanner;

public class Tarefa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
    }

}