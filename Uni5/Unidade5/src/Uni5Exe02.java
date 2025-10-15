import java.util.Scanner;

public class Uni5Exe02 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Uni5Exe02();
    }

    public Uni5Exe02() {
        numeros();
    }

    public void numeros() {
        int somaPar = 0;
        int somaImpar = 0;
        for(int i = 0; i <= 100; i++) {
            

            if (i % 2 == 0) {
                somaPar += i;
            } else  {
                somaImpar += i;
            }
        }

        System.out.println("Soma dos numeros pares: " + somaPar);
        System.out.println("Soma dos numeros ímpares: " + somaImpar);
    }
}
