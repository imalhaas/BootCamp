package Tarefas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaDeTarefas {
        private ArrayList<Tarefas> tarefas;
        public ListaDeTarefas() {
            this.tarefas = new ArrayList<>();
        }




    public static void adicionarTarefa(Scanner scanner, ListaDeTarefas listaDeTarefas) {
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a data da tarefa: ");
        String data = scanner.nextLine();

        System.out.println("Essa tarefa ja foi adicionada antes? ");
        System.out.print("Deseja adicionar Tarefa? (S/N): ");

        Scanner ler = new Scanner(System.in);
        String resposta = scanner.nextLine();

       switch (resposta) {
           case "S":
           Tarefas tarefaNova = new Tarefas(descricao, data);
           listaDeTarefas.adicionarTarefa(tarefaNova);
           break;
           case "N":
               break;
       }
    }
    private void adicionarTarefa(Tarefas tarefa) {
                tarefas.add(tarefa);
                System.out.println("Tarefa adcionada com sucesso");
    }




    public void removerTarefa(Tarefas tarefa){
            tarefas.remove(tarefa);
    }
    public static void removerTarefa(Scanner scanner, ListaDeTarefas listaDeTarefas) {
        System.out.print("Digite a descrição da tarefa que deseja remover: ");
        String descricao = scanner.nextLine();

        System.out.println("Você está prestes a excluir a terefa selecionada...");
        System.out.print("Deseja continuar? (S/N): ");

        // Obtém a resposta do usuário
        Scanner ler = new Scanner(System.in);
        String resposta = scanner.nextLine();

        // Verifica se o usuário deseja continuar
        if (resposta.equalsIgnoreCase("S")) {
            // Lógica para excluir a tarefa (substitua com sua lógica real)
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Exclusão cancelada.");
        }
        Tarefas tarefaRemovida = new Tarefas(descricao, "");
        listaDeTarefas.removerTarefa(tarefaRemovida);
    }

        public void listarTarefas() {
            if (tarefas.isEmpty()) {
                System.out.println("Lista de tarefas vazia.");
            } else {
                System.out.println("Lista de Tarefas:");
                for (Tarefas tarefa : tarefas) {
                    System.out.println("- " + tarefa.getDescricao() + " (Data: " + tarefa.getData() + ")");
                }
            }
        }

        public void listarTarefasOrdemAlfabetica() {
            if (!tarefas.isEmpty()) {
                Collections.sort(tarefas);
                listarTarefas();
            } else {
                System.out.println("Lista de tarefas vazia.");
            }
        }

        public void listarTarefasOrdemCronologica() {
            if (!tarefas.isEmpty()) {
                tarefas.sort((t1, t2) -> t1.getData().compareTo(t2.getData()));
                listarTarefas();
            } else {
                System.out.println("Lista de tarefas vazia.");
            }
        }


   public static void exibirMenu() {
        System.out.println("\n### Aplicativo de Lista de Tarefas ###");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Remover Tarefa");
        System.out.println("3. Listar Tarefas");
        System.out.println("4. Listar em Ordem Alfabética");
        System.out.println("5. Listar em Ordem Cronológica");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    }





