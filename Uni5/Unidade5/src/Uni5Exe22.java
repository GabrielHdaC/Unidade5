public class Uni5Exe22 {

    double salario, aumento;
    int ano;

    public static void main(String[] args) {
        new Uni5Exe22();
    }

    public Uni5Exe22() {
        calcularSalarioAtual();
    }

    public void calcularSalarioAtual() {
        salario = 2000.0;
        aumento = 0.015;
        ano = 1995;

        while (ano < 2025) {
            ano++;

            salario += salario * aumento;

            if (ano >= 1997) {
                aumento *= 2;
            }
        }

        System.out.printf("Salário em %d: R$ %.2f%n", ano, salario);
    }
}
