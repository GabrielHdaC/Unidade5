import java.util.Scanner;

public class Uni5Exe01 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Uni5Exe01();
    }

    public Uni5Exe01() {
        numeros();
    }

    public void numeros() {
        int numero = 0;
        for(int i = 0; i <= 20; i++) {
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }
    }
}
