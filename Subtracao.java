package src;
import static org.mockito.Mockito.*;
public class Subtracao  extends src.Calculadora {
  public Subtracao(double num1, double num2, double resultado) {
    super(num1, num2, resultado);
  }

  @Override
  public double operacao() {
    resultado = num1 - num2;
    return this.resultado;
  }
}

