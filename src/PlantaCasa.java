public class PlantaCasa {
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("A casa foi construida, as caracteristicas são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de Quartos " + numeroQuartos);
        System.out.println("Numero de Banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void pintar(){
        System.out.println("A casa foi pintada de: ");
        System.out.println("Cor " + cor);
    }
}
