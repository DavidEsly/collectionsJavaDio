package list.operacoesBasicas;

public class Main {
    public static void main(String[] args) {

//        ListaTarefas lt = new ListaTarefas();
//        lt.adicionarTarefa("Task 1");
//        lt.adicionarTarefa("Task 1");
//        lt.adicionarTarefa("Task 2");
//        System.out.println(lt.obterNumeroTotalTarefas());
//        lt.removerTarefa("Task 1");
//        System.out.println(lt.obterNumeroTotalTarefas());
//        lt.obterDescricoesTarefas();

        CarrinhoCompras mercado = new CarrinhoCompras();
        System.out.println(mercado.calcularValorTotal());
        mercado.adicionarItem("Cuscuz Coringa", 2.19, 5);
        mercado.adicionarItem("Cuscuz Coringa", 2.19, 5);
        mercado.adicionarItem("Biscoito Maizena", 4.89, 4);

        System.out.println(mercado.calcularValorTotal());

        mercado.exibirItens();
        mercado.removerItem("Cuscuz Coringa");
        System.out.println(mercado.calcularValorTotal());
        mercado.exibirItens();


    }
}