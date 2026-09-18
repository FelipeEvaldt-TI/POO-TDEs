package TDEs.TDE06.Ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        System.out.println("Quantos produtos? ");
        int quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.println("nome: ");
            String nome = sc.next();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();
            estoque.add(new Produto(nome, preco));
        }

        System.out.println("===Estoque===");
        double total = 0;
        for (Produto produto : estoque){
            System.out.printf("%s - %.2f%n", produto.nome, produto.preco);
            total += produto.preco;
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
