import java.util.Scanner;

public class Uni5Exe27 {
    Scanner sc = new Scanner(System.in);

    int dia, manha, tarde, totalDia;
    int maiorProducao = 0, diaMaiorProducao = 0;
    int totalManha = 0, totalTarde = 0;
    double valorDia;
    int opcao = 1;

    public static void main(String[] args) {
        new Uni5Exe27();
    }

    public Uni5Exe27() {
        calcular();
    }

    public void calcular() {
        while (opcao == 1) {
            System.out.print("\nDia do mês (1 a 30): ");
            dia = sc.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                System.out.print("Dia do mês (1 a 30): ");
                dia = sc.nextInt();
            }

            System.out.print("Peças turno manhã: ");
            manha = sc.nextInt();
            System.out.print("Peças turno tarde: ");
            tarde = sc.nextInt();

            totalDia = manha + tarde;

            if (dia <= 15) {
                if (totalDia > 100 && manha >= 30 && tarde >= 30)
                    valorDia = totalDia * 0.8;
                else
                    valorDia = totalDia * 0.5;
            } else {
                valorDia = manha * 0.4 + tarde * 0.3;
            }

            System.out.println("R$ " + String.format("%.2f", valorDia));

            if (totalDia > maiorProducao) {
                maiorProducao = totalDia;
                diaMaiorProducao = dia;
            }

            totalManha += manha;
            totalTarde += tarde;

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            opcao = sc.nextInt();
        }

        System.out.println("\nMaior produção no dia: " + diaMaiorProducao);
        if (totalManha > totalTarde)
            System.out.println("Mais peças no turno da manhã: " + totalManha);
        else
            System.out.println("Mais peças no turno da tarde: " + totalTarde);
    }
}
