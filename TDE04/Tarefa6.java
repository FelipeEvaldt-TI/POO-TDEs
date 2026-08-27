package TDEs.TDE04;

import java.util.ArrayList;

//Escreva um método void aplicarDesconto(double[] precos, double percentual) que reduz cada preço pelo percentual. Leia do console quantos preços e os valores, chame o método e imprima a lista alterada — comprovando que o método mudou o array original (referência).
public class Tarefa6 {
    public static void main(String[] args) {
        ArrayList<Integer> precos = new ArrayList<>();
        precos.add(99);
        precos.add(450);
        precos.add(30);
        precos.add(20);
        System.out.println(precos);
        aplicarDesconto(precos, 10);
        System.out.println(precos);
    }
    public static void aplicarDesconto(ArrayList<Integer> precos, int valorDesconto){
        for (int i = 0; i < precos.size(); i++){
            precos.set(i, precos.get(i) - valorDesconto);
        }
    }
}
