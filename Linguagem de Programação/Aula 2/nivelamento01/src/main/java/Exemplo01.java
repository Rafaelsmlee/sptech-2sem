public class Exemplo01 {

    public static void main(String[] args) {

        // Classes são sempre com letra maíusculas
        // Tipo ou classes Wrapper
        // Eles guardam um OBJETO que tem um valor
        // Consegue usar em funções
        // botar final na frente da variável vira um const exp:
        //final Boolean = true;


        Boolean bloqueado = true;
        Integer idade = 30;
        String nome = "Diego";
        Double altura = 1.80;
        Long numeroGrande = 1000000L;
        Float numeroFlutuante = 0.4f;
        Character letra = 'a';

        // Consigo guardar valores null exp:
        idade = null;

       // Tipos primitivos:
        //São mais leves, IDE sugere a usar, mas o ideal é usar os wrappers
        // Não consegue usar em funções

        int idade2 = 30;
        boolean bloqueado2 = true;
        double altura2 = 1.80;
        long numeroGrande2 = 1000000L;
        float numeroFlutuante2 = 0.4f;
        char letra2 = 'a';

        // Não consegue guardar valores tipo null exp:
        idade2 = 0;

        // Nunca pode nomear a variável com o mesmo nome, pois da erro.

    }


}
