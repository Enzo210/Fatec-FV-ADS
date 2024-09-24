import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // int ID = scanner.nextInt();
        // int Horas = scanner.nextInt();
        // Double ValorHora = scanner.nextDouble();
        // Double salario = Horas * ValorHora;
        // System.out.println("NUMBER = "+ ID);
        // System.out.printf("SALARY = U$ %.2f%n", salario);
        // Double A = scanner.nextDouble();
        // Double B = scanner.nextDouble();
        // Double C = scanner.nextDouble();

        // double media = (A * 2 + B * 3 + C * 5) / (2 + 3+ 5);
        // System.out.printf("MEDIA = %.1f\n", media);        

        int X = scanner.nextInt();
        Double Y = scanner.nextDouble();
        Double km = X * Y ;
        System.out.println(km+ " km/l");
    }
}
