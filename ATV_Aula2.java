import java.util.Scanner;

public class ATV_Aula2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("===== CARDÁPIO =====");
        System.out.println("1 - Pizza - R$ 35,00");
        System.out.println("2 - Pastel     - R$ 15,00");
        System.out.println("3 - Hamburguer      - R$ 20,00");
        System.out.println("4 - Cachorro-quente ... R$ 15,00");
        System.out.println("5 - Batata Frita ...... R$ 12,00");
        System.out.println("6 - Coxinha ........... R$ 8,00");
        System.out.println("7 - Refrigerante - R$ 8,00");
        System.out.println("8 - Suco       - R$ 6,00");
        System.out.println("9 - Sorvete .......... R$ 9,00");
        System.out.println("10 - Sair do cardápio \n");

        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nVocê escolheu Pizza.");
                break;

            case 2:
                System.out.println("Você escolheu Pastel.");
                break;
            case 3:
                System.out.println("Você escolheu hamburguer.");
                break;
            case 4:
                System.out.println("Você escolheu cachorro-quente.");
                break;
            case 5:
                System.out.println("Você escolheu batata frita.");
                break;
            case 6:
                System.out.println("Você escolheu coxinha.");
                break;
            case 7:
                System.out.println("Você escolheu refrigerante.");
                break;
            case 8:
                System.out.println("Você escolheu suco.");
                break;
            case 9:
                System.out.println("Você escolheu sorvete.");
                break;
            case 10:
                System.out.println("Saindo do cardápio.\n");
                break;
            default:
                System.out.println("Opção inválida.");
                break;

        }
    }
}
