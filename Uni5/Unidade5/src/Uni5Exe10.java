import java.util.Scanner;

public class Uni5Exe10 {
    Scanner sc = new Scanner(System.in);
    int cont = 0;

    public static void main(String[] args) {
        new Uni5Exe10();
    }

    public Uni5Exe10() {
        lerPropriedade();
    }

    public void lerPropriedade() {
        for (int i = 1; cont < 10; i++) {

            // calcula divisor conforme o tamanho do número
            int metade = (int) Math.pow(10, (int) (Math.log10(i) / 2 + 0.5));

            int partE = i / metade;
            int partD = i % metade;
            int soma = partE + partD;

            if (soma * soma == i) {
                System.out.println(i);
                cont++;
            }
        }
    }
}
