package src;

import src.Divisao;
import src.Multiplicacao;
import src.Soma;
import src.Subtracao;

import java.util.Scanner;
import static org.mockito.Mockito.*;
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
        if (numeroUsuario < 1 || numeroUsuario > 4) {
            int numErrado = 1;
            while (numErrado == 1) {

                System.out.println("+------------------------------------------------+");
                System.out.println("| AVISO! É preciso escolher uma opercação válida |");
                System.out.println("+------------------------------------------------+\n");

                System.out.printf("Escolha uma das opções abaixo para começar\n");
                System.out.printf("1 - soma\n");
                System.out.printf("2 - subtração\n");
                System.out.printf("3 - multiplicação\n");
                System.out.printf("4 - divisão\n");

                numeroUsuario = entrada.nextInt();

                if (numeroUsuario >= 1 && numeroUsuario <= 4) {
                    numErrado = 0;
                }

            }//Fim while

            System.out.println("\n---------------------------------------------------------");
        }

        System.out.printf("Digite o primeiro número:");
        double x = entrada.nextDouble();

        System.out.printf("\nDigite o segundo número:");
        double y = entrada.nextDouble();

        double resultado;

        switch (numeroUsuario) {
            case 1: //Soma
                Soma somaFinal = new Soma(x, y, 0);
                resultado = somaFinal.operacao();
                System.out.printf("O resultado da soma de " + x + " + " + y + "= " + resultado);
                break;
            case 2: //Subtração
                Subtracao subtracaoFinal = new Subtracao(x, y, 0);
                resultado = subtracaoFinal.operacao();
                System.out.printf("O resultado da subtração de " + x + " - " + y + "= " + resultado);
                break;
            case 3: //Multiplicação
                Multiplicacao multiplicacaoFinal = new Multiplicacao(x, y, 0);
                resultado = multiplicacaoFinal.operacao();
                System.out.printf("O resultado da multiplicação de " + x + " x " + y + "= " + resultado);
                break;
            case 4: //Divisão
                Divisao divisaoFinal = new Divisao(x, y, 0);
                resultado = divisaoFinal.operacao();
                System.out.printf("O resultado da divisão de " + x + " / " + y + "= " + resultado);
                break;
        }// Fim switch
    }
}
