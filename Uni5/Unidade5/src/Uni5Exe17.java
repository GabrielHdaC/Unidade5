import java.util.Scanner;

public class Uni5Exe17 {
    Scanner sc = new Scanner(System.in);

    int nInscricao;
    float altura;

    float maiorAltura = 0, menorAltura = Float.MAX_VALUE, somaAlturas = 0;
    int inscricaoMaior, inscricaoMenor, qtdAtletas;

    public static void main(String[] args) {
        new Uni5Exe17();
    }

    public Uni5Exe17() {
        receberValores();
    }

    public void receberValores() {
        while (true) {
            System.out.print("Digite o n° de inscrição: ");
            nInscricao = sc.nextInt();

            if (nInscricao == 0) {
                break;
            }

            if (nInscricao < 0) {
                System.out.println("Número de Inscrição inválido! Tente novamente.");
                continue;
            }

            System.out.print("Digite a altura: ");
            altura = sc.nextFloat();

            somaAlturas += altura;
            qtdAtletas++;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                inscricaoMaior = nInscricao;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                inscricaoMenor = nInscricao;
            }
        }

        float media = somaAlturas / qtdAtletas;

        System.out.printf("O atleta mais baixo tem %.2fm e o seu número de inscrição é %d", menorAltura, inscricaoMenor);
        System.out.printf("\nO atleta mais alto tem %.2fm e o seu número de inscrição é %d", maiorAltura, inscricaoMaior);
        System.out.printf("\nA altura média do grupo de atletas é: %.2fm", media);
    }
}
