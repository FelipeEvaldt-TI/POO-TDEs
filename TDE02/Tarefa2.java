package TDEs.TDE02;

public class Tarefa2 {
    public static void main(String[] args) {
        int[] v = {3, 6, 9, 2, 4, 10};
        System.out.println("soma: "+soma(v));
    }
    static int soma(int[] v){
        int total = 0;
        for (int x : v){
            total += x;
        }
        return total;
    }
}
