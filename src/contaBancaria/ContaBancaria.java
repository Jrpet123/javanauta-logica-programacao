package contaBancaria;

public class ContaBancaria  {
    //Atributos privados
    private String titular;
    private double saldo;

    //Getter e Setter - Métodos padrões para acessar e modificar os atributos

    //metodo para obter o titular
    public String getTitular() {
        return titular;
    }

    //metodo para modificar o titular
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //construtor com atributos, passados dentro do parâmetro
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //construtor sem atributos com o intellij marcando none no generate
    public ContaBancaria() {
    }

    //contrutor com 1 atributo
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    //construtor que inicializa a conta bancaria com saldo 0
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
}
