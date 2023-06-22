package src;

public class Subtracao  extends Calculadora{
  public Subtracao(double num1, double num2, double resultado) {
    super(num1, num2, resultado);
  }

  @Override
  public double operacao() {
    resultado = num1 - num2;
    return this.resultado;
  }
}

