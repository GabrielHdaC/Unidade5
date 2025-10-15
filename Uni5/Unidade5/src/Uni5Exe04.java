import java.util.Scanner;

public class Uni5Exe04 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        new Uni5Exe04();
    }

    public Uni5Exe04() {
        calculo();
    }

    public void calculo() {
        double soma = 0;
        for(int i = 1; i <=20; i++) {
            double numerador = 3 + (i - 1) * 2;
            double denominador = i * (i + 1);
            soma += numerador / denominador;
        }

        System.out.println("Soma: " + soma);
    }
}
