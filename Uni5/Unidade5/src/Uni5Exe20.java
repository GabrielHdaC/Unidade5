import java.util.Scanner;

public class Uni5Exe20 {
    Scanner sc = new Scanner(System.in);

    double massaInicial;
    double massa;
    int tempo;

    public static void main(String[] args) {
        new Uni5Exe20();
    }

    public Uni5Exe20() {
        calcularTempo();
    }

    public void calcularTempo() {
        System.out.print("Informe a massa inicial (Kg): ");
        massaInicial = sc.nextDouble();

        massa = massaInicial;
        tempo = 0;

        while (massa >= 0.0005) {
            massa = massa / 2;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.5f Kg\n", massaInicial);
        System.out.printf("Massa final: %.5f Kg\n", massa);
        System.out.printf("Tempo necessário: %d segundos\n", tempo);
    }
}
