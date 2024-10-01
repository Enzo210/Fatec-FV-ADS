// import java.util.Scanner;

// public class PreencheVetor {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] X = new int[10];
       
//         for (int i = 0; i < X.length; i++) {
//             X[i] = scanner.nextInt();
//         }

//         for (int i = 0; i < X.length; i++) {
//             if (X[i] <= 0) {
//                 X[i] = 1;
//             }
//         }
//         for (int i = 0; i < X.length; i++) {
//             System.out.println("X[" + i + "] = " + X[i]);
//         }

//     }
// }

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(;;) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }

            // Criar a matriz
            int[][] matriz = new int[N][N];

            // Preencher a matriz com os valores conforme o exemplo
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = Math.max(i, j) + 1;
                }
            }

            // Imprimir a matriz formatada
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // Formatar a saída
                    System.out.printf("%3d", matriz[i][j]);
                    if (j < N - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println(); // Linha em branco após cada matriz
        }

        scanner.close();
    }
}
