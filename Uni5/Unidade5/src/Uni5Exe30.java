import java.util.Scanner;

public class Uni5Exe30 {
    Scanner sc = new Scanner(System.in);

    int n, k, m;
    int somaDentro = 0, somaFora = 0;
    String dentro = "", fora = "", todos = "";

    int capacidade, valor;

    public static void main(String[] args) {
        new Uni5Exe30();
    }

    public Uni5Exe30() {
        calcularMochila();
    }

    public void calcularMochila() {
        System.out.print("Informe o valor inicial N: ");
        n = sc.nextInt();

        System.out.print("Informe o decremento K: ");
        k = sc.nextInt();

        System.out.print("Informe o tamanho máximo da mochila M: ");
        m = sc.nextInt();

        capacidade = m;
        valor = n;

        while (valor > 0) {
            todos += valor + " ";
            if (valor <= capacidade) {
                dentro += valor + " ";
                somaDentro += valor;
                capacidade -= valor;
            } else {
                fora += valor + " ";
                somaFora += valor;
            }
            valor -= k;
        }

        System.out.println("\nElementos a serem colocados: " + todos +
                "\nEntraram na mochila: " + dentro +
                "\nFicaram fora da mochila: " + fora +
                "\nSoma dos que entraram: " + somaDentro +
                "\nSoma dos que ficaram fora: " + somaFora);
    }
}
