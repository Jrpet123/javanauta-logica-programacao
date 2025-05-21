package heranca;

public class Principal {
    public static void main(String[] args) {

        Cachorro pincher = new Cachorro();
        pincher.latir();
        pincher.beber();
        pincher.comer("Ração");
        pincher.dormir();

        Galinha pintadinha = new Galinha();
        pintadinha.ciscar();
        pintadinha.beber();
        pintadinha.comer("Milho");
        pintadinha.dormir();
    }
}
