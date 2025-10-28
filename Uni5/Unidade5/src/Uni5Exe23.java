import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) {
        new Uni5Exe23();
    }

    public Uni5Exe23() {
        gerarRelatorioVendedores();
    }

    public void gerarRelatorioVendedores() {
        Scanner scanner = new Scanner(System.in);
        String opcao = "s";

        while (opcao.equalsIgnoreCase("s")) {

            System.out.print("\nNome do vendedor: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade de produtos vendidos no mês: ");
            int n = scanner.nextInt();

            double totalVendas = 0;
            int contador = 1;

            while (contador <= n) {
                System.out.print("\nPreço unitário do produto " + contador + ": R$ ");
                double preco = scanner.nextDouble();

                System.out.print("Quantidade vendida do produto " + contador + ": ");
                int qtd = scanner.nextInt();

                totalVendas += preco * qtd;
                contador++;
            }

            double salario = totalVendas * 0.30;

            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
            System.out.printf("Salário do mês: R$ %.2f%n", salario);

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            scanner.nextLine();
            opcao = scanner.nextLine();
        }

        System.out.println("\nEncerrando programa. Relatórios finalizados.");
    }
}
