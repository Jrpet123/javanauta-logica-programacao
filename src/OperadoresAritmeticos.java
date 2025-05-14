public class OperadoresAritmeticos {

    public static void main(String[] args) {
        double pao = 10.50;
        double acucar = 4.00;
        double queijo = 8.00;
        double desconto = 5.00;
        int totalDeDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDeDiasDoMes;

        System.out.println("Valor total: R$" + valorTotal);
        System.out.println("Valor c/ desconto: " + valorTotalComDesconto);
        System.out.println("Valor dividido: " + valorTotalDividido);
        System.out.println("Valor mensal: " + valorTotalMensal);
    }
}
