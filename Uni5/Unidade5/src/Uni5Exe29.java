import java.util.Scanner;

public class Uni5Exe29 {
    Scanner sc = new Scanner(System.in);

    int valor, n20, n10, n5, n2, n1;

    public static void main(String[] args) {
        new Uni5Exe29();
    }

    public Uni5Exe29() {
        calcularCedulas();
    }

    public void calcularCedulas() {
        System.out.print("Informe o valor a ser sacado: ");
        valor = sc.nextInt();

        n20 = valor / 20;
        valor = valor % 20;

        n10 = valor / 10;
        valor = valor % 10;

        n5 = valor / 5;
        valor = valor % 5;

        n2 = valor / 2;
        valor = valor % 2;

        n1 = valor;
        System.out.println("\nCédulas:" +
                "\n20: " + n20 +
                "\n10: " + n10 +
                "\n5: " + n5 +
                "\n2: " + n2 +
                "\n1: " + n1);
    }
}
