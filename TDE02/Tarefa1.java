package TDEs.TDE02;

public class Tarefa1 {
    public static void main(String[] args) {
        System.out.println("4 é par? " + ehpar(4));
        System.out.println("7 é par? " + ehpar(7));
    }
    static boolean ehpar(int n){
        return n % 2 == 0;
    }
}
