package CaixaEletronico;

import java.util.Scanner;

public class Caixa {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o saldo inicial da conta: ");
            double saldoInicial = scanner.nextDouble();

            ContaBancaria conta = new ContaBancaria(saldoInicial);

            while (true) {
                exibirMenu();
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Informe o valor para depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.print("Informe o valor para saque: ");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        break;
                    case 3:
                        System.out.print("Informe o valor para transferência: ");
                        double valorTransferencia = scanner.nextDouble();
                        System.out.print("Informe o saldo inicial da conta destino: ");
                        double saldoDestino = scanner.nextDouble();
                        ContaBancaria contaDestino = new ContaBancaria(saldoDestino);
                        conta.transferir(contaDestino, valorTransferencia);
                        break;
                    case 4:
                        System.out.println("Saldo atual: R$ " + conta.getSaldo());
                        break;
                    case 5:
                        System.out.println("Saindo do caixa eletrônico. Até logo!");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }

        private static void exibirMenu() {
            System.out.println("\n### Caixa Eletrônico ###");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
        }
    }
