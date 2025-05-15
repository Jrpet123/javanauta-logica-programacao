import estapaDeConstrucao.PlantaCasa;

public class Casa {
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

        casa.mudarCorDaParede("Branco");

        casa.alterarCaracteristica(100, 2, 2, "Madeira");

        int resultado = casa.somarMetragem();
        System.out.println(resultado + " metros²");

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroQuartos = 1;
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.cor = "Amarela";

        casaVizinho.construir();
        casaVizinho.pintar();
    }
}
