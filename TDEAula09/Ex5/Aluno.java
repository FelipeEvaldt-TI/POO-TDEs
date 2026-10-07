package TDEs.TDEAula09.Ex5;

public class Aluno {
    private String nome;
    private double nota1, nota2;

    Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {return nome;}
    public double media() {return (nota1 + nota2) / 2.0;}
}
