package list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ord = new OrdenacaoNumeros();

        ord.adicionarNumero(1);
        ord.adicionarNumero(24);
        ord.adicionarNumero(13);
        ord.adicionarNumero(176);
        ord.adicionarNumero(0);
        ord.adicionarNumero(7);
        ord.adicionarNumero(9);
        ord.adicionarNumero(15);

        System.out.println(ord.ordenarAscendente().toString());
        System.out.println(ord.ordenarDescendente().toString());

    }
}
