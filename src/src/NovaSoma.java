package src;
import java.math.BigDecimal;

public class NovaSoma extends src.Calculadora {
    public NovaSoma(){}

    BigDecimal soma;

    @Override
    public double operacao(){
        this.soma = BigDecimal.valueOf(num1 + num2);
        return this.soma;
    }
}
