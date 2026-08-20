package TDEs.TDE03;

import java.util.Scanner;

//Leia uma frase e imprima quantos caracteres ela tem e a frase toda em maiúsculas.
public class Tarefa1 {
    public static void main(String[] args) {
        System.out.println("Digite uma frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine().strip();

        System.out.println("Essa frase: " + frase.toUpperCase() + " tem " + frase.replace(" ","").length() + " letras.");
    }
}
