package set.pesquisa;

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
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
