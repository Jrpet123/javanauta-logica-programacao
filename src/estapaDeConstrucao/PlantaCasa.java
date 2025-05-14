public class PlantaCasa {
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    private void construir(){
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
    public static void main(String[] args) {
        //Criando o Objeto Casa
        PlantaCasa casa = new PlantaCasa();

        //inicianlizando os atributos (variaveis) (caracteristicas) casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material= "Tijolo";
        casa.cor = "Cinza";

        //chamada da funcao (metodo) da ordem
        casa.construir();

        casa.pintar();
    }

}