package contaBancaria;

public class Agencia {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("José", 500);

        System.out.println("O titular da conta é: " + minhaConta.getTitular() +
                " e o saldo da conta é " + minhaConta.getSaldo());

        minhaConta.setTitular("José Petrucio");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500); //pego o saldo inicial e somo mais 500

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é: " + titularConta +
                " e o saldo da conta é " + saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("Maria");
        System.out.println("O titular da conta é: " + contaMinhaMae.getTitular() +
                " e o saldo da conta é " + contaMinhaMae.getSaldo());
    }
}
