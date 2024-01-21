package calculadora;


    public class Principal {
        public static void main(String[] args) {
            Calculadora calculadora = new Calculadora();

            double numero1 = 10.0;
            double numero2 = 5.0;
            char operacao = '+';

            double resultado = calculadora.calcular(numero1, numero2, operacao);

            System.out.println("Resultado da operação: " + resultado);
        }
    }


