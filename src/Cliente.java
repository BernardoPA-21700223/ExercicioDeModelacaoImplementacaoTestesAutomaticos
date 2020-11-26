import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    String nome;
    int contacto;
    int nif;
    List<Tarefa> tarefas;

    public Cliente() {
    }

    public Cliente(String nome, int contacto, int nif) {
        this.nome = nome;
        this.contacto = contacto;
        this.nif = nif;
        this.tarefas= new ArrayList<>();
    }
}
