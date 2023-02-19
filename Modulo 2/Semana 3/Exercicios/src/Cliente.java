public class Cliente {
    double peso;
    double altura;
    Integer idade;
    String nome;

    public Cliente(double peso, double altura, String nome){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    public Cliente(double peso, double altura, Integer idade){
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String arg){
        this.nome = arg;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double arg){
        this.peso = arg;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double arg){
        this.altura = arg;
    }
}
