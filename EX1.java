import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}
