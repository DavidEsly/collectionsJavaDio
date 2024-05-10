package set.pesquisa;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();
        lt.adicionarTarefa("Teste01");
        lt.adicionarTarefa("Teste02");
        lt.adicionarTarefa("Teste03");
        lt.adicionarTarefa("Teste04");
        lt.adicionarTarefa("Teste05");

        System.out.println(lt.listTaskSize());

        lt.removerTarefa("Teste01");

        System.out.println(lt.showTasks().toString());

        lt.setTaskDone("Teste03");
        lt.setTaskDone("Teste05");
        lt.setTaskDone("Teste04");

        System.out.println(lt.getDoneTasks().toString());
        System.out.println(lt.getPendingTasks().toString());
        System.out.println(lt.listTaskSize());

        lt.setTaskPending("Teste04");

        System.out.println(lt.getDoneTasks().toString());
        System.out.println(lt.getPendingTasks().toString());

        lt.clearSet();

        System.out.println(lt.listTaskSize());

    }
}
