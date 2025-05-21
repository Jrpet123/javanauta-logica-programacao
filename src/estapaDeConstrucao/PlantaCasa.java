package estapaDeConstrucao;

public class PlantaCasa implements Construcao {
    //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    @Override
    public void construir(){
        System.out.println("A casa foi construida, as caracteristicas são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de Quartos " + numeroQuartos);
        System.out.println("Numero de Banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor " + cor);

    }

    @Override
    public int calcularConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
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

