import java.util.Scanner;

public class Uni5Exe13 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Uni5Exe13();
    }

    public Uni5Exe13() {
        viagem();
    }

    public void viagem() {
        System.out.print("Número total de reabastecimentos: ");
        int n = sc.nextInt();

        double totalKm = 0;
        double totalCombustivel = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nParada " + i + ":");
            System.out.print("Quilometragem percorrida: ");
            double km = sc.nextDouble();

            System.out.print("Combustível abastecido (litros): ");
            double litros = sc.nextDouble();

            double kmPorLitro = km / litros;
            System.out.printf("Parada " + i + ": %.2f km por litro\n", kmPorLitro);

            totalKm += km;
            totalCombustivel += litros;
        }

        double mediaGeral = totalKm / totalCombustivel;
        System.out.printf("\nQuilometragem média obtida por litro: %.2f\n", mediaGeral);
    }
}
