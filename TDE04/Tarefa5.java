package TDEs.TDE04;

import java.util.ArrayList;

//Escreva um método int somaSegura(int[] valores) que devolve 0 se o array for null, e a soma dos elementos caso contrário.
public class Tarefa5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(4590);
        numeros.add(4);
        numeros.add(6);
        System.out.println(somaSegura(numeros));
    }

    public static int somaSegura(ArrayList<Integer> numeros) {
        int total = 0;
        if (numeros != null) {
            for (int item : numeros) {
                total += item;
            }
            return total;
        } else {
            return 0;
        }
    }

}

