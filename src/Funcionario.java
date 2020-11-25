
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario {
    static int lastId;

    int id;
    String nome;
    List<Tarefa> tarefas;

    Funcionario(String nome){
        this.nome = nome;
        this.id =lastId++;
        this.tarefas=new ArrayList<>();
    }


    void adicionaTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }


    int numeroHoras (Date mes){



        return 0;
    }


    private boolean temBonus(Date mes){



        return false;
    }





}
