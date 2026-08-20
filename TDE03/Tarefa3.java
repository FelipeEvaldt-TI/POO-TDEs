package TDEs.TDE03;

import java.util.ArrayList;

//Crie uma ArrayList<String> com alguns nomes e imprima todos numerados (1 - Ana, 2 - Bruno...).
public class Tarefa3 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Felipe");
        nomes.add("Edgar");
        nomes.add("Wesley");

        for (int i = 0; i < nomes.size(); i++){
            System.out.println((i + 1) + " - " + nomes.get(i));
        }
    }
}
