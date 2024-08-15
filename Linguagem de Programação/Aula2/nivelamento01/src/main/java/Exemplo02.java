public class Exemplo02 {

    public static void main(String[] args) {

        Integer idade = 20;
        String nome = "Bob";

        String mensagem;

        if (idade >= 18 && nome != "Bob") {

            mensagem = "Maior de idade";
            System.out.println(mensagem);
         } else if ( idade > 60) {
            System.out.println("Idoso");
                } else {
                System.out.println("Menor de idade");
            }

//        String mensagemTernario = idade >= 18 ? "Maior de idade" : "Menor de idade";
//        System.out.println( mensagemTernario);

//        System.out.println( idade >= 18 ? "Maior de idade" : "Menor de idade");


    }
}
