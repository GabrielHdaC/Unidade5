import java.util.Scanner;

public class Uni5Exe25 {
    Scanner sc = new Scanner(System.in);

    int pontosDireita = 0, pontosEsquerda = 0;
    String ponto = " ";

    public static void main(String[] args) {
        new Uni5Exe25();
    }

    public Uni5Exe25() {
        disputarPartida();
    }

    public void disputarPartida() {
        while (true) {
            System.out.print("\nInforme o ponto(D para direita / E para esquerda): ");
            ponto = sc.nextLine();

            if (ponto.equalsIgnoreCase("D")) {
                pontosDireita++;
            } else if (ponto.equalsIgnoreCase("E")) {
                pontosEsquerda++;
            } else {
                System.out.println("Código inválido! Use apenas D ou E.");
                continue;
            }

            System.out.println("\n-- Placar parcial --" +
                    "\nEsquerda: " + pontosEsquerda +
                    "\nDireita: " + pontosDireita);

            if ((pontosDireita >= 21 && pontosDireita - pontosEsquerda >= 2) ||
                    (pontosEsquerda >= 21 && pontosEsquerda - pontosDireita >= 2))
                break;
        }

        if (pontosDireita > pontosEsquerda) {
            System.out.println("\nVencedor: Jogador da DIREITA");
        } else {
            System.out.println("\nVencedor: Jogador da ESQUERDA");
        }

        System.out.println("\n-- Placar final --" +
                "\nEsquerda: " + pontosEsquerda +
                "\nDireita: " + pontosDireita);
    }
}
