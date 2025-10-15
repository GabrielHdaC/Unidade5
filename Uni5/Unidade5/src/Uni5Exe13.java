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
        double totalComb = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Parada " + i + ": Quilometragem: ");
            double km = sc.nextDouble();

            System.out.print("Combustível: ");
            double comb = sc.nextDouble();

            double kmPorLitro = km / comb;
            System.out.printf("Parada %d: %.1f km por litro%n", i, kmPorLitro);

            totalKm += km;
            totalComb += comb;
        }

        double media = totalKm / totalComb;
        System.out.printf("Quilometragem média obtida por litro: %.2f%n", media);
    }
}
