import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("+---------------------------------------------------------+");
        System.out.println("|           Seja bem-vinde a nossa calculadora            |");
        System.out.println("+---------------------------------------------------------+");

        System.out.printf("Escolha uma das opções abaixo para começar\n");
        System.out.printf("1 - soma\n");
        System.out.printf("2 - subtração\n");
        System.out.printf("3 - multiplicação\n");
        System.out.printf("4 - divisão\n");

        //Lendo os primeiros dados do usuário
        Scanner entrada = new Scanner(System.in);

        int numeroUsuario = entrada.nextInt();

        //verificando se o usuário fez uma opção válida
        if(numeroUsuario < 1 || numeroUsuario > 4 ) {
            int numErrado = 1;
            while(numErrado == 1) {

                System.out.println("+------------------------------------------------+");
                System.out.println("| AVISO! É preciso escolher uma opercação válida |");
                System.out.println("+------------------------------------------------+\n");

                System.out.printf("Escolha uma das opções abaixo para começar\n");
                System.out.printf("1 - soma\n");
                System.out.printf("2 - subtração\n");
                System.out.printf("3 - multiplicação\n");
                System.out.printf("4 - divisão\n");

                numeroUsuario = entrada.nextInt();

                if(numeroUsuario >= 1 && numeroUsuario <= 4){numErrado = 0;}

            }//Fim while

            System.out.println("\n---------------------------------------------------------");

        }
    }
}
