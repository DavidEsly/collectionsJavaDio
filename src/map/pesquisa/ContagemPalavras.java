package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(palavras.toString());
    }

    public void encontrarPalavraMaisFrequente(){
        Map<String, Integer> mWord = new HashMap<>();
        int maior = 0;
        String valor="";
        for (Map.Entry<String,Integer> i: palavras.entrySet()){
            if (i.getValue() >= maior){
                maior = i.getValue();
                valor = i.getKey();
            }
        }
        mWord.put(valor, maior);
        System.out.println(mWord);
    }

    public static void main(String[] args) {
        ContagemPalavras ct = new ContagemPalavras();

        ct.adicionarPalavra("Teste", 15);
        ct.adicionarPalavra("David", 34);
        ct.adicionarPalavra("Ana", 59);
        ct.adicionarPalavra("Gabi", 4);
        ct.adicionarPalavra("Bruce", 123);

        ct.exibirContagemPalavras();
        ct.encontrarPalavraMaisFrequente();
        ct.removerPalavra("Teste");
        ct.exibirContagemPalavras();
    }
}
