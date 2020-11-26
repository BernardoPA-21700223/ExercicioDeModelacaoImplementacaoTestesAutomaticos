import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioGestor("bernardo"));
        funcionarios.add(new FuncionarioTarefeiro("joao"));



        Cliente a = new ClienteParticular("a",1,2);
System.out.println("a");
    }

}
