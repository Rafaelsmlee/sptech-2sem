import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

    public static void main(String[] args) {

        // Vetores tem valores fixos
        // Listas ficam criando vários vetores para guardar as coisas

        List listaLoka = List.of("Pedro", true, 1, 6.0, "Manoel");
        System.out.println(listaLoka);

        // < T > é tipo genérico que aceita qualquer tipo de **objeto**
        // Lembrar que os que não são objetos são só os primitivos exp: int
        List<String> nomes = List.of("Manoel", "Pedro", "Rafael", "Vitor");
        System.out.println(nomes);

        List<Double> notas = List.of(4.56, 2.4, 6.44);
        System.out.println(notas);

        // Da para criar uma lista dentro da lista List <List<Double>> exemplo = List of(List of)


        //Jeito correto para fazer a lista;
        List<String> frutas = new ArrayList<>();
        frutas.add("Uva");
        System.out.println(frutas);

        //Ao criar uma lista com List.of criamos uma lista IMUTÁVEL
        //Para criar uma lista MUTÁVEL devemos utilizar o new ArrayList<>()

        List<String> frutas2 = new ArrayList<>(List.of("Abacate", "Pera"));
        frutas2.add("Uva"); //add = push do JS
        System.out.println(frutas2);

        frutas2.set(1, "Morango".toLowerCase()); //Assim vc ta subistituindo a "Pera" que estava na posição 1
        System.out.println(frutas2);

        frutas2.remove(("Abacate"));
        System.out.println(frutas2);

        frutas2.remove(0);
        System.out.println(frutas2);

        List<Integer> numeros = new ArrayList<>(List.of(42,34,25,12));
        System.out.println(numeros);
//        numeros.remove(34);
        Integer numeroParaRemover = 34;
        numeros.remove(numeroParaRemover);
        System.out.println(numeros);

        System.out.println("Tamanho da lista de numeros:" + numeros.size());
        System.out.println("Ultimo numero da lista " + numeros.get(numeros.size() - 1));
        //Java 21 ou mais recente
        System.out.println("Ultimo numero da lista " + numeros.getLast());
        // get SEMPRE pega pelo índice.

        // addAll = adiciona mais que 1 na lista
        frutas2.addAll( List.of("Goiabada", "Kiwi", "Carambola", "Laranja"));
        System.out.println(frutas2);

        frutas2.add(2, "Caqui");
        System.out.println(frutas2);

        //Percorrendo lista de frutas
        for (int i = 0; i < frutas2.size(); i++) {
            System.out.println("Frutas da vez: " + i + " " + frutas2.get(i));
        }

        //Criando o parametro da função
        frutas2.forEach( frutaDaVez ->/*a seta demonstra que está relacionada a uma função */ {
            System.out.println("Fruta da vez " + frutaDaVez);
        });

        //Iterando com for aprimorado
        System.out.println("Iterando com for aprimorador");
        for (String frutaDaVez : frutas2){
            System.out.println("Fruta da vez: " + frutaDaVez);
        }


    }


}
