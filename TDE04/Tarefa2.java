package TDEs.TDE04;

import java.util.ArrayList;
import java.util.Arrays;

//Escreva um método que recebe um int[] e dobra todos os elementos. Mostre que o array original muda (objeto é passado por referência).
public class Tarefa2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3 ,8};
        numero(numeros);
        System.out.println(Arrays.toString(numeros));
    }
    public static void numero(int[] numeros){
        for (int i = 0;i < numeros.length; i++){
            numeros[i] *= 2;
        }
    }
}
