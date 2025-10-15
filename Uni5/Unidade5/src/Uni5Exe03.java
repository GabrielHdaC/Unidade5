import java.util.Scanner;

public class Uni5Exe03 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        new Uni5Exe03();
    }

    public Uni5Exe03() {
        calculo();
    }

    public void calculo() {
        double soma = 0;
        for(int i = 1; i <=100; i++) {
            soma+= 1.0 / i;
        }

        System.out.println("Soma: " + soma);
    }
}
