package calculadora;

class Calculadora {
    private double somar(double a, double b) {
        return a + b;
    }

    private double subtrair(double a, double b) {
        return a - b;
    }

    private double multiplicar(double a, double b) {
        return a * b;
    }

    private double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
    }

    public double calcular(double a, double b, char operacao) {
        switch (operacao) {
            case '+':
                return somar(a, b);
            case '-':
                return subtrair(a, b);
            case '*':
                return multiplicar(a, b);
            case '/':
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operação inválida.");
        }
    }
}
