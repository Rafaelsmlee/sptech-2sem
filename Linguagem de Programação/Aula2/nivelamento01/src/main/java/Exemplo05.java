public class Exemplo05 {
    public static void main(String[] args) {

        // + , - , /, *, %,
        // Alt + J = selecionar a mesma palavra

        System.out.println("Soma");
        Integer soma = 1_000_000 + 5;
        System.out.println(soma);

        System.out.println("Subtracao");
        Integer subtracao = 10 - 5;
        System.out.println(subtracao);

        System.out.println("Divisao");
        Integer divisao = 10 / 5;
        System.out.println(divisao);

//        System.out.println("Multiplicacao");
//        Integer multiplicacao = 10 / 3;
//        System.out.println(multiplicacao);

//        System.out.println("Multiplicacao");
//        Float multiplicacao = 10 / 3.0f;
//        System.out.println(multiplicacao);

        System.out.println("Multiplicacao");
        Double multiplicacao = 10 / 3.0;
        System.out.println(multiplicacao);

        System.out.println("Potenciacao");
        Double potenciacao = Math.pow(2, 3);
        System.out.println(potenciacao);

    }
}