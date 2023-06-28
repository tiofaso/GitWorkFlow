package src;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;

public class NovaMultiplicacao extends Multiplicacao implements MostraResultado {

    public NovaMultiplicacao(double num1, double num2, double resultado) {
        super(num1, num2, resultado);
    }

    @Override
    public void mostraResultados() {
        System.out.printf("O resultado é:" + resultado);
    }
}

