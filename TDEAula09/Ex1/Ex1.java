package TDEs.TDEAula09.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.77);
        produto.setPreco(-10);
        System.out.println(produto.getNome() + ": " + produto.getPreco());
        produto.setPreco(5.0);
        System.out.println(produto.getNome() + ": " + produto.getPreco());
    }
}
