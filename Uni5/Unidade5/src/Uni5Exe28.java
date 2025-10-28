import java.util.Scanner;

public class Uni5Exe28 {
    Scanner sc = new Scanner(System.in);

    int voto, votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0;
    int totalVotos = 0;
    String opcao = "s";

    int vencedor = 0;
    String nomeVencedor = "";

    public static void main(String[] args) {
        new Uni5Exe28();
    }

    public Uni5Exe28() {
        calcular();
    }

    public void calcular() {
        while (opcao.equalsIgnoreCase("s")) {
            System.out.println("\n1 - Nenhum de Nós" +
                               "\n2 - CPM22" +
                               "\n3 - Skank" +
                               "\n4 - Jota Quest");
            System.out.print("Informe seu voto: ");
            voto = sc.nextInt();

            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 3:
                    votos3++;
                    break;
                case 4:
                    votos4++;
                    break;
                default:
                    System.out.println("Voto inválido");
                    continue;
            }

            totalVotos++;
            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            opcao = sc.next();
        }

        System.out.println("\nResultados:" +
                "\nNenhum de Nós: " + votos1 + " votos" +
                "\nCPM22: " + votos2 + " votos" +
                "\nSkank: " + votos3 + " votos" +
                "\nJota Quest: " + votos4 + " votos");

        if (votos1 > vencedor) {
            vencedor = votos1;
            nomeVencedor = "Nenhum de Nós";
        }
        if (votos2 > vencedor) {
            vencedor = votos2;
            nomeVencedor = "CPM22";
        }
        if (votos3 > vencedor) {
            vencedor = votos3;
            nomeVencedor = "Skank";
        }
        if (votos4 > vencedor) {
            vencedor = votos4;
            nomeVencedor = "Jota Quest";
        }

        System.out.println("\nVencedor: " + nomeVencedor + " com " + vencedor + " votos!");
    }
}
