
import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    static int lastId;
    int id;
    String nome;
    List<Tarefa> tarefas;

    public Funcionario() {
        this.id = lastId++;
    }

    Funcionario(String nome) {
        this.nome = nome;
        this.id = lastId++;
        this.tarefas = new ArrayList<>();
    }




    void adicionaTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }





}
