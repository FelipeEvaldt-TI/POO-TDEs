package TDEs.TDE03;

import java.util.Scanner;

//Leia uma palavra e diga se ela é um palíndromo (igual de trás para frente, como "arara").
public class Tarefa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String invertido = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(invertido)){
            System.out.println("é palíndromo!");
        }else{
            System.out.println("não é palíndromo!");
        }

    }
}
