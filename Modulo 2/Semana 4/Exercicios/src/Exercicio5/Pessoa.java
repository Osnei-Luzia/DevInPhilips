package Exercicio5;

public class Pessoa {
    protected String nome, sobrenome;
    protected String obterNomeCompleto(){
        String retorno = this.nome +" "+ this.sobrenome;
        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
