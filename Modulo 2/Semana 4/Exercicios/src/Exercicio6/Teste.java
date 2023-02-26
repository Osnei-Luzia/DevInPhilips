package Exercicio6;
public class Teste{
    public void validar(String valorCampo, Integer valorMaximoCampo) throws TamanhoInvalidoException {
        if(valorCampo==null||valorMaximoCampo==null||valorMaximoCampo<0){
            throw new IllegalArgumentException();
        }else if(valorCampo.length()>valorMaximoCampo){
            throw new TamanhoInvalidoException();
        }
    }
}