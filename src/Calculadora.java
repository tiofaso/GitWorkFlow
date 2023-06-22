public abstract class Calculadora {
    double num1;
    double num2;
    double resultado;

    public Calculadora(double num1, double num2, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    public double operacao() {

        return resultado;
    }
}
