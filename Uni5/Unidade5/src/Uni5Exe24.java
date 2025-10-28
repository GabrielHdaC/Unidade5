import java.util.Scanner;

public class Uni5Exe24 {

    public static void main(String[] args) {
        new Uni5Exe24();
    }

    public Uni5Exe24() {
        controlarPesca();
    }

    public void controlarPesca() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o limite diário de pesca (em kg): ");
        double limiteKg = scanner.nextDouble();

        double limiteGramas = limiteKg * 1000;
        double totalGramas = 0;

        String opcao = "s";

        scanner.nextLine();

        while (opcao.equalsIgnoreCase("s")) {

            System.out.print("\nInforme o peso do peixe (em gramas): ");
            double pesoPeixe = scanner.nextDouble();

            totalGramas += pesoPeixe;

            System.out.printf("Peso total acumulado: %.2f g (%.2f kg)%n",
                    totalGramas, totalGramas / 1000);

            if (totalGramas > limiteGramas) {
                System.out.println("\nLIMITE DIÁRIO EXCEDIDO! Encerrando registro da pesca.");
                break;
            }

            scanner.nextLine();
            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            opcao = scanner.nextLine();
        }

        System.out.println("\nPeso final da pesca: " + totalGramas + " g (" + (totalGramas / 1000) + " kg)");
        scanner.close();
    }
}
