import java.util.Scanner;

public class PreencheVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] X = new int[10];

        // Leitura dos valores para o vetor X
        for (int i = 0; i < X.length; i++) {
            X[i] = scanner.nextInt();
        }

        // Substituição de valores nulos e negativos por 1
        for (int i = 0; i < X.length; i++) {
            if (X[i] < 0) {
                X[i] = 1;
            }
        }

        // Imprimindo o vetor X
        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }

    }
}
