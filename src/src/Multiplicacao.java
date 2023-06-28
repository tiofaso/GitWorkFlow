package src;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class Multiplicacao extends src.Calculadora {

    public Multiplicacao(double num1, double num2, double resultado) {
        super(num1, num2, resultado);
    }

    @Override
    public double operacao() {
        resultado = num1 * num2;
        return this.resultado;

    }
    @Test
    public void operacaoSucesso(){
        when(operacao()).thenReturn(1.0);
        Assert.assertEquals(3.0,2.0);

    }

}

