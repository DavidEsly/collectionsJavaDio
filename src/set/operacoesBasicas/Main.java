package set.operacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas p = new ConjuntoPalavrasUnicas();

        p.adicionarPalavra("Dados");
        p.adicionarPalavra("Dados");
        p.adicionarPalavra("Dardos");
        p.adicionarPalavra("Darwf");
        p.adicionarPalavra("David");
        p.adicionarPalavra("Dad");


        System.out.println(p.exibirPalavrasUnicas().toString());
        System.out.println(p.verificarPalavra("Dard"));
        p.removerPalavra("David");
        System.out.println(p.exibirPalavrasUnicas());
    }
}
