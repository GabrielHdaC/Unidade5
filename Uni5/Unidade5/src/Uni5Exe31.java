import java.util.Scanner;

public class Uni5Exe31 {
    Scanner sc = new Scanner(System.in);

    int numero, divisor;

    public static void main(String[] args) {
        new Uni5Exe31();
    }

    public Uni5Exe31() {
        decompor();
    }

    public void decompor() {
        System.out.print("Informe um número inteiro positivo: ");
        numero = sc.nextInt();

        System.out.println("\nnúmero | decomposição");

        divisor = 2;
        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(numero + " | " + divisor);
                numero = numero / divisor;
            } else {
                divisor++;
            }
        }

        System.out.println("1");
    }
}
