package Tarefas;

class Tarefas implements Comparable<Tarefas> {
    private String descricao;
    private String data;

    public Tarefas(String descricao, String data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    @Override
    public int compareTo(Tarefas outraTarefa) {
        return this.descricao.compareTo(outraTarefa.getDescricao());
    }
}