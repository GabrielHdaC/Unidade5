import java.util.Scanner;

public class Uni5Exe16 {
    Scanner sc = new Scanner(System.in);

    String genero;
    float altura;

    float somaF, somaG;
    int contF, contG;

    public static void main(String[] args) {
        new Uni5Exe16();
    }

    public Uni5Exe16() {
        receberValores();
    }

    public void receberValores() {
        while (true) {
            System.out.println("Digite a altura(0 para encerrar): ");
            altura = sc.nextFloat();

            if (altura == 0) {
                break;
            }

            if (altura < 0) {
                System.out.println("Altura invalida! Tente novamente");
                continue;
            }

            System.out.println("Digite a gênero(M/F/O: ");
            genero = sc.next().toUpperCase();
            System.out.println();

            if (!genero.equals("M") && !genero.equals("F") && !genero.equals("O")) {
                System.out.println("Gênero invalido! Tente novamente");
                continue;
            }

            somaG += altura;
            contG++;

            if (genero.equals("F")) {
                somaF += altura;
                contF++;
            }
        }

        if (contF > 0) {
            float mediaF = somaF / contF;
            System.out.printf("Média de altura das mulheres: %.2f", mediaF);
        } else {
            System.out.println("Nenhuma mulher informada");
        }

        if (contG > 0) {
            float mediaG = somaG / contG;
            System.out.printf("\nMédia de altura do grupo: %.2f", mediaG);
        }
    }
}
