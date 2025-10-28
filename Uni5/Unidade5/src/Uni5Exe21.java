public class Uni5Exe21 {
    double chico;
    double ze;
    int anos;

    public static void main(String[] args) {
        new Uni5Exe21();
    }

    public Uni5Exe21() {
        calcularCrescimento();
    }

    public void calcularCrescimento() {
        chico = 1.50;
        ze = 1.10;
        anos = 0;

        while (ze <= chico) {
            chico += 0.02;
            ze += 0.03;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Zé seja maior que Chico.");
    }
}
