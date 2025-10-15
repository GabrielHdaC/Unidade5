import java.util.Scanner;

public class Uni5Exe09 {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    int idade;
    String nome;

    public static void main(String[] args) {
        new Uni5Exe09();
    }

    public Uni5Exe09() {
        lerAlunos();
    }

    public void lerAlunos() {
        System.out.print("Digite a quantidade de alunos: ");
        n = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        String nomes18 = "";
        int qtdAcima20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nNome: ");
            nome = sc.nextLine();

            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();

            if (idade == 18) {
                if (nomes18.equals("")) {
                    nomes18 = nome;
                } else {
                    nomes18 += " e " + nome;
                }
            }

            if (idade > 20) {
                qtdAcima20++;
            }
        }

        System.out.println("\nNomes dos alunos que têm 18 anos: " + (nomes18.equals("") ? "Nenhum" : nomes18));
        System.out.println("Quantidade de alunos com idade acima de 20 anos: " + qtdAcima20);
    }
}
