public class Utilitaria {

    void mensagem(String nome) { //Declarando um parametro
        System.out.println("Olá " + nome);
    }

    void exibirSoma(Integer numero1, Integer numero2) {
        Integer soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
    }

    Integer somar(Integer numero1, Integer numero2){
        Integer soma = numero1 + numero2;

        return soma;

        /*
        OU
        return numero1 + numero2;
         */
    }

    Boolean verificacaoMaiorIdade(Integer idade){
        Boolean maiorIdade = false;

        if(idade>18){
            maiorIdade = true;
        }
    }

}
