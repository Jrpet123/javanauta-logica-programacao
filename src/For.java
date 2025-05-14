import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de usuarios: ");
        int user = scanner.nextInt();

        for(int contador=1;contador<=user;contador++){
            System.out.println("User nº: " + contador);

        }
    }
}
