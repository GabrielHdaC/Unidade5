import java.util.Scanner;

public class Uni5Exe33 {
    Scanner sc = new Scanner(System.in);

    int voto, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
    int nulos = 0, brancos = 0, total = 0;

    double percNulos;
    double percBrancos;

    public static void main(String[] args) {
        new Uni5Exe33();
    }

    public Uni5Exe33() {
        votar();
    }

    public void votar() {
        do {
            System.out.println("\n1 - Candidato 1" +
                    "\n2 - Candidato 2" +
                    "\n3 - Candidato 3" +
                    "\n4 - Candidato 4" +
                    "\n5 - Nulo" +
                    "\n6 - Branco" +
                    "\n0 - Encerrar");
            System.out.print("Informe seu voto: ");
            voto = sc.nextInt();

            switch (voto) {
                case 0:
                    System.out.println("\nEncerrando votação...");
                    System.out.println();
                    mostrarResultados();
                    return;
                case 1:
                    cand1++;
                    total++;
                    break;
                case 2:
                    cand2++;
                    total++;
                    break;
                case 3:
                    cand3++;
                    total++;
                    break;
                case 4:
                    cand4++;
                    total++;
                    break;
                case 5:
                    nulos++;
                    total++;
                    break;
                case 6:
                    brancos++;
                    total++;
                    break;
                default:
                    System.out.println("Opção incorreta");
            }
        } while (true);
    }

    public void mostrarResultados() {
        if (total > 0) {
            percNulos = (nulos * 100.0) / total;
            percBrancos = (brancos * 100.0) / total;
        } else {
            percNulos = 0.0;
            percBrancos = 0.0;
        }

        System.out.println("Resultados:" +
                "\nCandidato 1: " + cand1 +
                "\nCandidato 2: " + cand2 +
                "\nCandidato 3: " + cand3 +
                "\nCandidato 4: " + cand4 +
                "\nNulos: " + nulos +
                "\nBrancos: " + brancos +
                "\nPercentual nulos: " + percNulos + "%" +
                "\nPercentual brancos: " + percBrancos + "%" +
                "\nTotal de votos: " + total);
    }
}
