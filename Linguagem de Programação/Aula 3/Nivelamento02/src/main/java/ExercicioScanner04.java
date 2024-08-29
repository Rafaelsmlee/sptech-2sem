import java.util.Scanner;

public class ExercicioScanner04 {

    public static void main(String[] args) {

        teste1 test = new teste1();
        Utilitaria util = new Utilitaria();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o primeiro número ");
        Integer numero1 = sc.nextInt();
        System.out.println("Digite o segundo número ");
        Integer numero2 = sc.nextInt();


        util.mensagem(nome); //Enviando um parametro
        util.exibirSoma(numero1, numero2);


        Integer resultado = util.somar(1,3);
        System.out.println("Resultado " + resultado);
        Integer outroResultado = util.somar(resultado,9);
        System.out.println(outroResultado);

        test.msg(nome);



    }


}
