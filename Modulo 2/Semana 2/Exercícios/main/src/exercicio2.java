public class exercicio2 {
    public static void metodo(){
        System.out.println("Início da Atividade 2");
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };
        System.out.println(notas[2][0]);
        System.out.println(notas[3][1]);
        for(int i=0;i<notas.length;i++){
            double soma = 0;
            for(int j=0;j<4;j++){
                soma += notas[i][j];
            }
            System.out.println(soma);
        }
    }
}
