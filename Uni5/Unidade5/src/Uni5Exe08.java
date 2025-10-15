import java.util.Scanner;

public class Uni5Exe08 {
    Scanner sc = new Scanner(System.in);

    int n;
    int num, menorNeg, somaPos, contPos = 0;

    public static void main(String[] args) {
        new Uni5Exe08();
    }

    public Uni5Exe08() {
        lerNumeros();
    }

    public void lerNumeros() {

        System.out.print("Digite a quantidade de números que serão lidos: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = sc.nextInt();

            if (num < 0) {
                if (menorNeg == 0 || num < menorNeg) {
                    menorNeg = num;
                }
            } else if (num > 0) {
                somaPos += num;
                contPos++;
            }
        }

        double mediaPos = 0;
        if (contPos > 0) {
            mediaPos = (double) somaPos / contPos;
        }

        System.out.println("\nMenor valor negativo: " + menorNeg);
        System.out.println("Média dos números positivos: " + mediaPos);
    }
}
