public class EstruturaIfElse {
    public static void main(String[] args) {

//        int idade = 30;
//
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade.");
//        } else {
//            System.out.printf("Você é menor de idade.");
//        }
//        boolean estaChovendo = true;
//
//        if (!estaChovendo) {
//            System.out.println("Vamos ficar em casa.");
//
//        } else {
//            System.out.printf("Vamos sair para passear.");
//        }
        boolean temDinheiro = true;
        boolean temCartao = false;

        if(temDinheiro && temCartao) {
            System.out.println("Pede ifood e Ze delivery.");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pede so ifood.");
        } else {
            System.out.println("Nao");
        }
  }

}
