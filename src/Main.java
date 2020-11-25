import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("bernardo"));
        funcionarios.add(new Funcionario("joao"));


        funcionarios.get(0).adicionaTarefa(new Tarefa("entrar cedo",8, new Date(25-11-2020)));

    }

}
