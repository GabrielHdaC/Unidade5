import java.util.Scanner;

public class Uni5Exe11 {
    Scanner sc = new Scanner(System.in);

    int horaDia = 16;

    public static void main(String[] args) {
        new Uni5Exe11();
    }

    public Uni5Exe11() {
        biscoito();
    }

    public void biscoito() {
        int biscoito = 1;
        int total = biscoito;
        for(int i = 2; i <= horaDia; i++) {
            if (i == 2) {
                biscoito = 3;
            } else {
                biscoito *= 3;
            }
            total += biscoito;
        }
        System.out.println(total);
    }
}
