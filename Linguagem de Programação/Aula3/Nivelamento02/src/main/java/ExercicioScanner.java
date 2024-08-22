import java.util.Scanner;

public class ExercicioScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();

        System.out.println("Quantas provas você fez?");
        Integer qntProvas = sc.nextInt();
        Double somaNotas = 0.0;

//        for (int i = 0; i < qntProvas; i++){
//            System.out.println(String.format("Digite a nota %d:", i+1)) ;
//            Double notas = sc.nextDouble();
//            somaNotas += notas;

        for (int i = 0; i < qntProvas;){
            System.out.println(String.format("Digite a nota %d:", ++i)) ; //Se botar o ++ antes ele incrementa antes e i++ incrementa pós
            Double notas = sc.nextDouble();
            somaNotas += notas;
            }

        Double mediaFinal = somaNotas / qntProvas;

        System.out.printf("""
                Aluno: %s\n
                Média: %.2f\n
               """, nome, mediaFinal);

        sc.close();
    }
}
