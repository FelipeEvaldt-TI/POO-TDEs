package TDEs.TDE06.Ex4;

public class Aluno {
    String nome;
    double nota1, nota2;

    Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    double media(){
        return (nota1 + nota2) / 2.0;
    }
}

