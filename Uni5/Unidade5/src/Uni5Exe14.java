import java.util.Scanner;

public class Uni5Exe14 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Uni5Exe14();
    }

    public Uni5Exe14() {
        calcularLucros();
    }

    public void calcularLucros() {
        int lucroMenor10 = 0;
        int lucroEntre10e20 = 0;
        int lucroMaior20 = 0;
        double totalCompra = 0;
        double totalVenda = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Mercadoria " + i + ": Preço de compra: ");
            double pc = sc.nextDouble();

            System.out.print("Mercadoria " + i + ": Preço de venda: ");
            double pv = sc.nextDouble();

            double percentualLucro = ((pv - pc) / pc) * 100;

            if (percentualLucro < 10) {
                lucroMenor10++;
            } else if (percentualLucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }

            totalCompra += pc;
            totalVenda += pv;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + lucroEntre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + lucroMaior20);
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);
    }
}
