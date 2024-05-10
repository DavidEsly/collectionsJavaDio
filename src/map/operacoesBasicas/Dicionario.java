package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public Map<String, String> exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            return dicionarioMap;
        } else {
            return null;
        }
    }

    public String pesquisarPorPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            return dicionarioMap.get(palavra);
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Dicionario dc = new Dicionario();

        dc.adicionarPalavra("inefável", "Que não pode ser nomeado, designado nem descrito");
        dc.adicionarPalavra("significado", "Sentido de uma palavra, termo, frase; sentido, conceito.");
        dc.adicionarPalavra("bloquear", "Impedir ou dificultar a entrada em");
        dc.adicionarPalavra("amar", "Ter amor por alguém; querer bem");

        System.out.println(dc.exibirPalavras());

        System.out.println(dc.pesquisarPorPalavra("amar"));

        dc.removerPalavra("amar");

        System.out.println(dc.exibirPalavras());
    }
}
