public class Exemplo03 {
    public static void main(String[] args) {

        String nome1 = "Manoel";
        String nome2 = new String( "Manoel");
        // criou o new String para criar um novo objeto -> exemplo: nome1 seria senha que o usuário criou e o nome2 é o
        //usuário tentando entrar na conta -> por isso usar o >> EQUALS <<


        if (nome1 == nome2){ //Comparando se são o MESMO OBJETO por isso da diferente
            System.out.println("São iguais");
        } else{
            System.out.println("São diferentes");
        }

        // >> IMPORTANTE <<
        if (nome1.equals(nome2)){ //Comparar se os VALORES são iguais
            // >>SEMPRE << comparar usando os WRAPPERS, não vai funcionar com os tipos primitivos

            System.out.println("São iguais");
        } else{
            System.out.println("São diferentes");
        }

    }
}
