package src;
import static org.mockito.Mockito.*;
public class Soma extends src.Calculadora {
    public Soma(double num1, double num2, double resultado){
        super(num1,num2,resultado);
    }

    @Override
    public double operacao(){
        resultado = num1 + num2;
        return this.resultado;
    }
}
