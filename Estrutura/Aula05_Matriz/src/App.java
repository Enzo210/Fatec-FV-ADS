import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        //3 linhas com 2 colunas
        //inicializa sem valores

        int[][] minha_matriz = new int [3][2];
        
        //atribuir valor
        minha_matriz[0][0]=1;
        minha_matriz[0][1]=2;

        minha_matriz[1][0]=3;
        minha_matriz[1][1]=4;

        minha_matriz[2][0]=5;
        minha_matriz[2][1]=6;

        // exibir uma array
        System.out.println(Arrays.deepToString(minha_matriz));
        // acesso direto
        System.out.println(minha_matriz[2][0]);

        //interando uma matriz
        for(int linha=0; linha<minha_matriz.length;linha++){
            for(int col=0; col<minha_matriz[linha].length;col++){
                System.out.println(minha_matriz[linha][col]+"");
            }
            System.out.println("");
        }

        //matriz com valores preenchidos ou inicializados 
        int [][] minha_matriz_v2 ={{1,2},{2,3},{5,6}};
 System.out.println(minha_matriz_v2);
    }
}
