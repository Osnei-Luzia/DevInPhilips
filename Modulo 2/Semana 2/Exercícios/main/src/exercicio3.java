public class exercicio3 {
    public static void metodo(){
        System.out.println("Início da Atividade 3");
        int[] extrato = { 100, -35, -15, -5, 55, -20 };
        for(Integer i: extrato){
            System.out.println(i);
        }
        System.out.println();
        for(int i=extrato.length;i>0;i--){
            System.out.println(extrato[i-1]);
        }
        System.out.println();
        Integer soma = 0;
        for(Integer i:extrato){
            soma += i;
        }
        if(soma>0){
            System.out.println("Saldo Positivo de: "+soma);
        }else{
            System.out.println("Saldo Negativo de: "+soma);
        }
    }
}
