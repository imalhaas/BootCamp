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

        Tarefas tarefaNova = new Tarefas(descricao, data);
        listaDeTarefas.adicionarTarefa(tarefaNova);

    }

    private void adicionarTarefa(Tarefas tarefa) {
            tarefas.add(tarefa);
        System.out.println("Tarefa adcionada com sucesso");
    }

    public void removerTarefa(Tarefas tarefa){
            tarefas.remove(tarefa);
        System.out.println("Tarefa removida com Sucesso");
    }

    public static void removerTarefa(Scanner scanner, ListaDeTarefas listaDeTarefas) {
        System.out.print("Digite a descrição da tarefa que deseja remover: ");
        String descricao = scanner.nextLine();

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





