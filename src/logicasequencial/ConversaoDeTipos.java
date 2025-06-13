package logicasequencial;

public class ConversaoDeTipos {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroString);

//        Double numeroDouble = 10.0;
//        String numeroDoubleString = numeroDouble.toString();

        String numeroDoubleStringDois= "12345";
        Double numeroConvertidoDouble = Double.parseDouble(numeroDoubleStringDois);

        Long numeroLong = 10L;
        String numeroLongConvertido = Long.toString(numeroLong);
        Long numeroDoubleString = Long.parseLong(numeroDoubleStringDois);


        System.out.println(d);
        System.out.println(int2);


    }
}
