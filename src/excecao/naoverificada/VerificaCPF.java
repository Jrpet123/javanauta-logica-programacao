package excecao.naoverificada;

import excecao.ConflictException;

import java.util.Scanner;

public class VerificaCPF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("DIgite seu cpf: ");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);
    }

    public static String verificaCPF(String cpf) {
        try {
            if (cpf.equals("11122233344")) {
                throw new ConflictException("CPF já cadastrado" + cpf);
            } else {
                return "CPF válido, usuario cadastrado.";
            }
        } catch (ConflictException e) {
            throw new ConflictException("CPF já cadastrado: " + cpf);
        }
    }
}
