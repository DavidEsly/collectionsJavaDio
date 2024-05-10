package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> taskSet;

    public ListaTarefas() {
        this.taskSet = new HashSet<>();
    }

    public void adicionarTarefa(String description) {
        taskSet.add(new Tarefa(description));
    }

    private Tarefa searchTask(String description) {
        Tarefa t = null;
        for (Tarefa tk : taskSet) {
            if (tk.getDescription().equalsIgnoreCase(description)) {
                t = tk;
                break;
            }
        }
        return t;
    }

    public void removerTarefa(String descricao) {
        Tarefa t = searchTask(descricao);
        if (t != null) {
            taskSet.remove(t);
        }
    }

    public Set<Tarefa> showTasks() {
        return taskSet;
    }

    public int listTaskSize() {
        return taskSet.size();
    }

    public Set<Tarefa> getDoneTasks() {
        Set<Tarefa> setTask = new HashSet<>();
        for (Tarefa t : taskSet) {
            if (t.isDone()) {
                setTask.add(t);
            }
        }
        return setTask;
    }

    public Set<Tarefa> getPendingTasks() {
        Set<Tarefa> setTask = new HashSet<>();
        for (Tarefa t : taskSet) {
            if (!t.isDone()) {
                setTask.add(t);
            }
        }
        return setTask;
    }

    public void setTaskDone(String description) {
        for (Tarefa t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(true);
                break;
            }
        }
    }

    public void setTaskPending(String description) {
        for (Tarefa t : taskSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setDone(false);
                break;
            }
        }
    }

    public void clearSet(){
        taskSet.clear();
    }
}
