import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agora digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite se sim ou nao se você está empregado? ");
        boolean empregado = scanner.nextBoolean();

        System.out.println("Olá, " + nome + "! e a sua idade é: " + idade + "! Está empregado: " + empregado);
    }
}
