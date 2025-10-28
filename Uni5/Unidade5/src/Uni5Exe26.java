import java.util.Scanner;

public class Uni5Exe26 {
    Scanner sc = new Scanner(System.in);

    int totalTrechos = 0;
    int acimaDoLimite = 0;
    int longosAceitos = 0;
    double distancia, valorMaximo, pedagio;

    public static void main(String[] args) {
        new Uni5Exe26();
    }

    public Uni5Exe26() {
        analisarTrechos();
    }

    public void analisarTrechos() {
        System.out.print("Informe o valor máximo de pedágio que Astolfo aceita pagar: R$ ");
        valorMaximo = sc.nextDouble();

        while (true) {
            System.out.print("\nInforme o valor do pedágio (negativo para encerrar): R$ ");
            pedagio = sc.nextDouble();

            if (pedagio < 0) {
                break;
            }

            System.out.print("Informe a distância do trecho (em Km): ");
            distancia = sc.nextDouble();

            totalTrechos++;
            if (pedagio > valorMaximo) {
                acimaDoLimite++;
            } else if (distancia > 150) {
                longosAceitos++;
            }
        }

        System.out.println("\nResultados: " +
                "\nTrechos acima do limite de pedágio: " + acimaDoLimite +
                "\nTotal de trechos informados: " + totalTrechos +
                "\nTrechos > 150 Km com pedágio aceito: " + longosAceitos);
    }
}
