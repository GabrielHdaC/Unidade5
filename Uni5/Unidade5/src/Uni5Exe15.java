import java.util.Scanner;

public class Uni5Exe15 {
    Scanner sc = new Scanner(System.in);

    String nome;
    float nota1, nota2, media;

    public static void main(String[] args) {
        new Uni5Exe15();
    }

    public Uni5Exe15() {

        receberValores();
    }

    public void receberValores() {
        while (true) {
            System.out.print("\nDigite o nome do aluno(ou 'fim' para encerrar): ");
            nome = sc.nextLine();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("\nDigite a nota 1 do aluno " + nome + ": ");
            nota1 = sc.nextFloat();

            System.out.print("Digite a nota 2 do aluno " + nome + ": ");
            nota2 = sc.nextFloat();

            sc.nextLine();

            if (nota1 < 0 || nota2 < 0) {
                System.out.println("Notas inválidas! Tente novamente");
                continue;
            }

            media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno " + nome + ": " + media);
        }
    }
}
