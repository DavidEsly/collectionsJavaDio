package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsToRemove = new ArrayList<>();
        for(Item i : itemList){
            if(i.getName().equalsIgnoreCase(nome)){
                itemsToRemove.add(i);
            }
        }
        itemList.removeAll(itemsToRemove);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : itemList){
            valorTotal += i.getPrice() * i.getQuantity();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList.toString());
    }
}
