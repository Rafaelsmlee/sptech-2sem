public class Exemplo04 {
    public static void main(String[] args) {

        System.out.println("For:");
        for(int j = 0; j <= 10; j++){
            System.out.println(j);
        }

        System.out.println("While:");
       int i = 15;
       while (i >= 1){
           System.out.println(i);
           i--;
       }
       // Normalmente usado como forma randomicamente
        // Rodar até o usuário escrever o que eu quero exp: senha

        System.out.println("Do..While");
       i = 0;
       do{
           System.out.println(i);
           i++;
       } while(i < 15);

       // Usa quando quer verificar se existe algo na lista  -> faça enquanto -> faça i++ enquanto o i < 15
        // A diferença que vc usa isso é pq vc procura de uma forma mais direta, não precisa correr todos os códigos
        // para poder achar oq vc ta procurando

    }
}


