import java.util.Scanner;

public class Uni5Exe34 {
    Scanner sc = new Scanner(System.in);

    int opcao = 0, diarias, contasEncerradas = 0;
    String nome;
    double total, taxa;

    public static void main(String[] args) {
        new Uni5Exe34();
    }

    public Uni5Exe34() {
        executarMenu();
    }

    public void executarMenu() {
        do {
            System.out.println("\n(1) Encerrar conta de um hóspede" +
                    "\n(2) Verificar número de contas encerradas" +
                    "\n(3) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nome do hóspede: ");
                    nome = sc.nextLine();

                    System.out.print("Número de diárias: ");
                    diarias = sc.nextInt();

                    if (diarias < 15)
                        taxa = 7.50;
                    else if (diarias == 15)
                        taxa = 6.50;
                    else
                        taxa = 5.00;

                    total = diarias * (50.00 + taxa);

                    System.out.println("\nHóspede: " + nome +
                            "\nTotal a pagar: R$ " + String.format("%.2f", total));

                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("\nContas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida");
            }
        } while (opcao != 3);
    }
}
