public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "José Petrucio";
        String nomeDois = "Nathalia Santos";
        String sobreNome = " Azevedo";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);
        String nomeCompleto = nome.concat(sobreNome);

        System.out.println("Olá, " + nome + "! Seu nome tem: " + tamanhoString + " caracteres.");
        System.out.println("Os nomes são iguais: " + saoIguais);
        System.out.println("Nome em upperCase: " + nome.toUpperCase());
        System.out.println("Nome em lowerCase: " + nome.toLowerCase());
        System.out.println("Nome completo: " + nomeCompleto);

    }
}
