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
    }
}
