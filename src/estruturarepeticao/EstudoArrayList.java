package estruturarepeticao;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add(1, "Banana");
        for (String item : listaDeCompras){
            System.out.println(item);
        }
        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3: " + item);

        listaDeCompras.remove("Sabão em pó");
        for (String item2 : listaDeCompras){
            System.out.println(item2);
        }

        boolean vazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("A lista está vazia? " + vazia + " , Qual o tamanho da lista? " + tamanho + " , a lista contem arroz? " + contem);

//        listaDeCompras.clear();
//        System.out.println("A lista de compras está vazia? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto));
    }
}