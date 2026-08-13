package TDEs.TDE02;

public class Tarefa4 {
    public static void main(String[] args) {
        int[] v = {1,25,5,3,10,4};
        System.out.println("O maior número é: " + maior(v));
    }
    static int maior(int[] v){
        int max = v[0];
        for (int i = 1; i < v.length; i++){
            if (v[i] > max){
                max = v[i];
            }
        }
        return max;
    }
}
