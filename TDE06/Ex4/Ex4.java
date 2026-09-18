package TDEs.TDE06.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carla", 7.5, 8.0);
        System.out.printf("%s: media  %.1f%n", aluno.nome, aluno.media());
    }
}