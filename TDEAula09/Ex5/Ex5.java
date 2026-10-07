package TDEs.TDEAula09.Ex5;

public class Ex5 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felipe", 5.0, 10.0);
        System.out.printf("%s: media %.1f%n", aluno.getNome(), aluno.media());
    }
}
