package estapaDeConstrucao;

public class PlantaCasa{
    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

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

    public void mudarCorDaParede(String novaCor){
        cor = novaCor;
        pintar();
    }

    public int somarMetragem(){
       return metragem * numeroBanheiros + numeroQuartos;
    }
    public void alterarCaracteristica(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        construir();

    }
}

