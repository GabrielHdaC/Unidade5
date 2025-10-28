import java.util.Scanner;

public class Uni5Exe18 {
    Scanner sc = new Scanner(System.in);

    int canal;
    int pessoas;

    int totalPessoas = 0;
    int c4 = 0, c5 = 0, c9 = 0, c12 = 0;

    public static void main(String[] args) {
        new Uni5Exe18();
    }

    public Uni5Exe18() {
        receberValores();
    }

    public void receberValores() {
        while (true) {
            System.out.print("Informe o canal (4, 5, 9, 12) ou 0 para encerrar: ");
            canal = sc.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Informe o número de pessoas assistindo: ");
            pessoas = sc.nextInt();

            totalPessoas += pessoas;

            switch (canal) {
                case 4:
                    c4 += pessoas;
                    break;
                case 5:
                    c5 += pessoas;
                    break;
                case 9:
                    c9 += pessoas;
                    break;
                case 12:
                    c12 += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido! Registro ignorado.");
                    break;
            }
        }

        if (totalPessoas > 0) {
            System.out.println("Percentual de audiência do canal 4: " + (c4 * 100 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 5: " + (c5 * 100 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 9: " + (c9 * 100 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 12: " + (c12 * 100 / totalPessoas) + "%");
        } else {
            System.out.println("Nenhum registro de audiência foi informado.");
        }
    }
}
