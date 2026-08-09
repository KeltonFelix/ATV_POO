import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite números para somar (digite 0 para encerrar");
        numero = scanner.nextInt();
        soma += numero;

        while (numero != 0) {

            System.out.println("Digite um número:");
            numero = scanner.nextInt();

            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }

}
