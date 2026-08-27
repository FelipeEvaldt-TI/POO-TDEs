package TDEs.TDE04;

import java.util.Arrays;

//Crie um array, aponte um segundo nome para ele (int[] apelido = original;), altere por apelido e mostre que original também mudou (aliasing).
public class Tarefa3 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] apelido = original;
        apelido[0] = 100;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(apelido));
    }
}
