package Exercicio5;

public class Aluno extends Pessoa{
    private String matricula = "1234321";
    public String registrar(){
        String retorno = "Sou o "+ obterNomeCompleto() +" e minha matrícula é "+this.matricula;
        return retorno;
    }
}
