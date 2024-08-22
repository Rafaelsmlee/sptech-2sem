import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExercicioScanner2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 100");
        Integer numeroDigitado = sc.nextInt();

//        do {
//            System.out.println("Digite um número de 1 a 100");
//            Integer numeroDigitado = sc.nextInt();
//        } while(numeroDigitado > 100 || numeroDigitado < 0));

        while (numeroDigitado > 100 || numeroDigitado < 0){
            System.out.println("Calma amigo, vai com calma é de 1 a 100");
             numeroDigitado = sc.nextInt();
        }

        Integer primeiraAparicao = 201;
        for ( int i = 0; i < 200; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,101);

            System.out.println(String.format(
                    "Número sorteado na %d vez: %d", i+1, numeroSorteado));
//            if (numeroSorteado.equals(numeroDigitado))
            if (numeroSorteado == numeroDigitado && primeiraAparicao == 201) {
                primeiraAparicao = i + 1;

                if(primeiraAparicao < 200) {
                    System.out.println("Primeira aparição do número foi no número: " + primeiraAparicao);
                }

                if(numeroSorteado < 10){
                    System.out.println("Você é MUITO sortudo");
                } else if (numeroSorteado > 50) {
                    System.out.println("Melhor parar de apostar e ir trabalhar!");
                } else{
                    System.out.println("Você é sortudo");
                }

            }
        }



        }

    }

    /*
     * Peça para o usuário digitar um número entre 0 e 100.
     * Caso ele digite um valor menor ou maior continue pedindo até
     * que ele digite um valor válido.
     *
     * Sorteie 200 números.
     *
     * Armazene a primeira vez que o número digitado foi sorteado.
     *
     * Após isso. Exiba uma frase de acordo com a quantidade de sorteios
     * Se for menor que 10: "Você é MUITO sortudo"
     * Se for entre 10 e 50: "Você é sortudo"
     * Se for maior que 50: "Melhor parar de apostar e ir trabalhar!"
     */


