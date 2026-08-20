package TDEs.TDE03;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Escreva um método que recebe uma ArrayList<Integer> e devolve a média dos números.
public class Tarefa4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(50);
        numeros.add(30);
        System.out.printf("Média: %.2f%n", media(numeros));

    }
    static double media(ArrayList<Integer> lista){
        int soma = 0;
        for (int n : lista){
            soma += n;
        }
        return (double) soma / lista.size();
    }
}
