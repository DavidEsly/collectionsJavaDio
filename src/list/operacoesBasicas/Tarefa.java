package list.operacoesBasicas;

public class Tarefa {

    String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
}
