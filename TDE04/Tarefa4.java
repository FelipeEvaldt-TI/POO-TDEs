package TDEs.TDE04;
//Crie duas String com o mesmo conteúdo usando new String(...). Compare com == e com .equals() e observe a diferença.
public class Tarefa4 {
    public static void main(String[] args) {
        String palavra1 = new String("cachorro");
        String palavra2 = new String("cachorro");
        System.out.println("Palavra == Palavra :      " + (palavra1 == palavra2));
        System.out.println("Palavra equals Palavra :  " + (palavra1.equals(palavra2)));
    }
}
