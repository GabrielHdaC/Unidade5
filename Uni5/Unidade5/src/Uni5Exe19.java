import java.util.Scanner;

public class Uni5Exe19 {
    Scanner sc = new Scanner(System.in);

    double valorCompra;
    double totalRecebido = 0;
    double valorPagar;

    public static void main(String[] args) {
        new Uni5Exe19();
    }

    public Uni5Exe19() {
        calcularVendas();
    }

    public void calcularVendas() {
        while (true) {
            System.out.print("Informe o valor da compra (0 para encerrar): R$ ");
            valorCompra = sc.nextDouble();

            if (valorCompra == 0) {
                break;
            }

            if (valorCompra > 500) {
                valorPagar = valorCompra * 0.80;
            } else {
                valorPagar = valorCompra * 0.85;
            }

            System.out.printf("Valor a pagar: R$%.2f%n", valorPagar);
            totalRecebido += valorPagar;
        }

        System.out.printf("\nO valor total recebido foi de R$%.2f\n", totalRecebido);
    }
}
