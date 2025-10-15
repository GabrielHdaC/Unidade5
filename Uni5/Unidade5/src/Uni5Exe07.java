import java.util.Scanner;

public class Uni5Exe07 {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    double num, maior, menor;

    public static void main(String[] args) {
        new Uni5Exe07();
    }

    public Uni5Exe07() {
        lerNumeros();
    }

    public void lerNumeros() {

        System.out.print("Digite a quantidade de numeros que serão lidas: ");
        n = sc.nextInt();

        System.out.print("Digite o 1º número: ");
        num = sc.nextDouble();

        maior = num;
        menor = num;

        for (int i = 2; i <= n; i++) {
            System.out.print("\nDigite o " + i + "º numero: ");
            num = sc.nextDouble();

            if (num < menor) {
                menor = num;
            }

            if (num > maior) {
                maior = num;
            }
        }

        System.out.printf("\nMaior nº: %.2f%n", maior);
        System.out.printf("Menor nº: %.2f%n", menor);
    }
}
