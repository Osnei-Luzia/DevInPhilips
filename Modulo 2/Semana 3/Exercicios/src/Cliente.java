public class Cliente {
    double peso;
    double altura;
    Integer idade;

    public Cliente(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    public Cliente(double peso, double altura, Integer idade){
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
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
