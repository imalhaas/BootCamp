package Tarefas;

import java.util.ArrayList;
import java.util.Scanner;

import static Tarefas.ListaDeTarefas.*;

public class App {

    public static void main(String[] args) {
       // ListaDeTarefas listaDeTarefas;

        Scanner scanner = new Scanner(System.in);
       ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner, listaDeTarefas);
                    break;
                case 2:
                    removerTarefa(scanner, listaDeTarefas);
                    break;
                case 3:
                    listaDeTarefas.listarTarefas();
                    break;
                case 4:
                    listaDeTarefas.listarTarefasOrdemAlfabetica();
                    break;
                case 5:
                    listaDeTarefas.listarTarefasOrdemCronologica();
                    break;
                case 6:
                    System.out.println("Saindo do aplicativo. Até logo!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

    }
    }

