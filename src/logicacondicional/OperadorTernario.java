package logicacondicional;

public class OperadorTernario {
    public static void main(String[] args) {
        boolean temDinheiro = true;
        boolean temCartao = false;

        String mensagem = (temDinheiro) ? "Pede um ifood" : "Come o que tem em casa";
        System.out.println(mensagem);
        String mensagemDois = (temCartao) ? "Pede ifood e Ze delivery" : "Come o que tem em casa";
        System.out.println(mensagemDois);

    }
}
