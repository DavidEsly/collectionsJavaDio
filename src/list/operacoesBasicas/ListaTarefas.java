package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        //Construtor que ao instanciar a classe cria uma lista de objetos do tipo Tarefa
        this.tarefaList = new ArrayList<>();
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void adicionarTarefa(String descricao){
        //Adicição de objetos do tipo tarefa
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        /*Como estamos trabalhando com uma lista de Objetos do tipo tarefa se faz necessário a criação de uma nova
         * collection do tipo tarefa para receber os objetos que serão excluidos
         */
        List<Tarefa> tasksToRemove = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tasksToRemove.add(t);
            }
        }
        tarefaList.removeAll(tasksToRemove);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }


}
