import java.util.Scanner;

public class EX6 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("=== Menu de opções ===");
            System.out.println("1 - Exibir uma mensagme motivacional.");
            System.out.println("2 - Exibir um número aleatório");
            System.out.println("3 - Exibir a tabuada de um número.");
            System.out.println("4 - Dizer olá");
            System.out.println("5 - Sair do programa.\n");

            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Não desista, a vista é linda da vitória!");
                    break;

                case 2:
                    int numeroAleatorio = (int) (Math.random() * 100);
                    System.out.println("Número aleatório: " + numeroAleatorio + "\n");
                    break;

                case 3:
                    System.out.println("Digite um número de 1 a 10.\n");
                    int numero = scanner.nextInt();

                    for (int i = 1; i <= 10; i++) {

                        System.out.println(numero + " * " + i + " = " + (numero * i) + "\n");
                    }
                    break;

                case 4:
                    System.out.println("Olá \n");
                    break;

                case 5:
                    System.out.println("Saindo do programa... \n");
                    break;
            }
        }

    }
}