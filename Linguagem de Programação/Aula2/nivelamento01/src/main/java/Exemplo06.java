public class Exemplo06 {

    public static void main(String[] args) {

        String nome = "Pedro Rocha";
        Integer idade = 23;
        Double altura = 1.74;
        Boolean bloqueado = false;

        // Console.log('Meu nome é ${nome}, tenho ${idade} anos,
//         tenho $(altura) de altura - Bloqueado: ${bloqueado}')

//        String mensagem = String.format("Nome: %s \nIdade: %d \nAltura: %.3f \nBloqueado: %b", nome, idade, altura, bloqueado);
//        System.out.println(mensagem);

                String mensagem = String.format("""
        Nome: %s 
        Idade: %d 
                     \tAltura: %.3f 
                     
        Bloqueado: %b
        10%%""", //para fazer % tipo 10% vc precisa usar 2x % ou seja 10%%
                        nome,
                        idade,
                        altura,
                        bloqueado);
        System.out.println(mensagem);
    }
}
