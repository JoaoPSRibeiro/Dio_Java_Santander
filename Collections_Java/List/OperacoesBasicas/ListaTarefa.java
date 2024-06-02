import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()){
            for(Tarefa t : tarefaList){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        } else{
            System.out.println("A Lista está vazia!");
        }
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else {
            System.out.println("A Lista está vazia!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da clase Listatarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar Leite");
        listaTarefa.adicionarTarefa("Estudar para exame");
        listaTarefa.adicionarTarefa("Fazer Exercícios");

        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista");

        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo tarefas da lista
        listaTarefa.removerTarefa("Comprar Leite");

        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista!");

        // Exibindo as descrições das tarefas atualizadas
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para exame");

        // Exibindo o número total de tarefas da lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");


    }
}
