import java.util.concurrent.ThreadLocalRandom;

public class Exemplo07 {

    public static void main(String[] args) {

        Integer numeroAleatorio =  ThreadLocalRandom.current()
                .nextInt(0,150);

        System.out.println(numeroAleatorio);


        System.out.println("\nnumeroRealAleatorio");
        Double numeroRealAleatorio = ThreadLocalRandom.current()
                .nextDouble(0, 10.50);

        System.out.println(String.format("%.2f", numeroRealAleatorio));



    }
}
