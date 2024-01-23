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

    private double potenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    private double raizQuadrada(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
    }

    private int calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Não é possível calcular o fatorial de um número negativo.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
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




