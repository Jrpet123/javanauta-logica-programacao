public class Arrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] frutas;

        //outra forma declarar já inicializando valores para cada posição
        frutas = new String[]{"Maçã", "Morango", "Abacaxi"};
        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[0] = 150.00;
        salarios[1] = 175.00;
        salarios[2] = 200.00;
        salarios[4] = 1000.00;

//        for(int posicao =0; posicao < salarios.length; posicao++) {
//            System.out.println("salarios: " + salarios[posicao]);
//        }

        for(double salario : salarios){
            System.out.println(salario);
        }

        salarios [2] = 250.00;
        System.out.println(salarios[2]);
    }
}
