import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("What do we say to the God of Death??");
        String death  = leitor.nextLine();

        System.out.println( death);


        System.out.println( "Qual a melhor temporada?");
        Integer temporada = leitor.nextInt();

        System.out.printf("""
                No one: %s
                Temporada: %d\n
          
                """, death, temporada);

        System.out.println("Qual a sua altura");
        Double altura = leitor.nextDouble();
        System.out.printf("altura: %.2f", altura);


    }
}
