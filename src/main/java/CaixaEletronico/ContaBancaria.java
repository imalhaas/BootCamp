package CaixaEletronico;

public class ContaBancaria {
        private double saldo;

        public ContaBancaria(double saldoInicial) {
            saldo = saldoInicial;
        }

        public double getSaldo() {
            return saldo;
        }


        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para saque ou saldo insuficiente.");
            }
        }

        public void transferir(ContaBancaria contaDestino, double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
            } else {
                System.out.println("Valor inválido para transferência ou saldo insuficiente.");
            }
        }
    }


