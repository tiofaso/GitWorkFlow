package src;

import src.Calculadora;
import src.InterfaceSubtracao;
import src.Subtracao;

public class NovaSubtracao  implements InterfaceSubtracao {
    private double num1;
    private double num2;
    private double resultado;
    Subtracao subtracao = new Subtracao(num1, num2, 0.0);
    @Override
    public void fazConta() {
        double resultado;

        resultado = num1 - num2;
        mostraResultado();
    }

    @Override
    public void mostraResultado() {
        System.out.printf("O resultado é:" + resultado);
    }
}
