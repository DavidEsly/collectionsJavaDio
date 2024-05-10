package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<Word> wordSet;

    public ConjuntoPalavrasUnicas(){
        this.wordSet = new HashSet<>();
    }


    public void adicionarPalavra(String palavra){
        wordSet.add(new Word(palavra));
    }

    public void removerPalavra(String palavra){
        for(Word c : wordSet){
            if(c.getWords().equalsIgnoreCase(palavra)){
                wordSet.remove(c);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra){
        Word w = new Word(palavra);
        return wordSet.contains(w);
    }

    public String exibirPalavrasUnicas(){
        return wordSet.toString();
    }
}
