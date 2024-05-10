package set.pesquisa;

import java.util.Objects;

public class Tarefa {

    private String description;
    private boolean done;

    public Tarefa(String description){
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(description, tarefa.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
