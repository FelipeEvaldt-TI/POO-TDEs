package TDEs.TDE02;

public class Tarefa5 {
    public static void main(String[] args) {
        int[] v = {0,1,2,3,4,5,6,7,8,9,10};
        int pares = 0, impares = 0;
        for (int x : v){
            if (x % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("ímpares: " + impares);
    }

}
