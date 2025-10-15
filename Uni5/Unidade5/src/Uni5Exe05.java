import java.util.Scanner;

public class Uni5Exe05 {
    Scanner sc = new Scanner(System.in);

    int termo = 8;
    int termoBase = 8;
    int definiTtermo = 7;

    public static void main(String[] args) {
        new Uni5Exe05();
    }

    public Uni5Exe05() {
        System.out.println("Termo 1: " + termo);
        realizarTermo();
    }

    public void realizarTermo() {

        // Se o termo é par soma em 2 à base(usando a base anterior)
        // Se é ímpar, multiplica a base por 2 e atualiza a base
        for (int i = 2; i <= definiTtermo; i++) {
            if (i % 2 == 0) {

                termo = termoBase + 2;
            } else {
                termo = termoBase * 2;
                termoBase = termo;
            }
            System.out.println("Termo " + i + ": " + termo);
        }
    }
}
