import java.util.Scanner;

public class Uni5Exe06 {
    Scanner sc = new Scanner(System.in);

    double media, soma = 0;

    public static void main(String[] args) {
        new Uni5Exe06();
    }

    public Uni5Exe06() {
        calcMedia();
    }

    public void calcMedia() {

        for (int i = 1; i <= 20; i++) {
            System.out.print("\nAltura da pessoa " + i + ": ");
            media = sc.nextDouble();

            soma += media;
        }

        soma = soma / 20;
        System.out.printf("A média das alturas é: %.2f%n", soma);
    }
}
