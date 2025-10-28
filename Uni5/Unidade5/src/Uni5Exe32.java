import java.util.Scanner;

public class Uni5Exe32 {
    Scanner sc = new Scanner(System.in);

    int primeiroDia, totalDias, dia;

    public static void main(String[] args) {
        new Uni5Exe32();
    }

    public Uni5Exe32() {
        imprimirCalendario();
    }

    public void imprimirCalendario() {
        System.out.print("Informe o dia da semana do primeiro dia (1=Dom, 2=Seg, ..., 7=Sáb): ");
        primeiroDia = sc.nextInt();

        System.out.print("Informe o número de dias do mês: ");
        totalDias = sc.nextInt();

        System.out.println("\nD\tS\tT\tQ\tQ\tS\tS");

        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("\t");
        }

        for (dia = 1; dia <= totalDias; dia++) {
            System.out.print(dia + "\t");

            if ((dia + primeiroDia - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
