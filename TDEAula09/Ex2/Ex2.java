package TDEs.TDEAula09.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Felipe", 33);
        pessoa.setIdade(-10);
        pessoa.setIdade(30);
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
