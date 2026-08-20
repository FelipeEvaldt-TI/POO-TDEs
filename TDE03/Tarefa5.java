package TDEs.TDE03;
//Leia uma palavra e conte quantas vogais ela tem.
import java.util.Locale;
import java.util.Scanner;

public class Tarefa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palvra: ");
        String palavra = sc.nextLine().toLowerCase();
        int vogais = 0;
        for (int i = 0; i < palavra.length(); i++){
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vogais++;
            }
        }
        System.out.println("Vogais: " + vogais);
    }
}
