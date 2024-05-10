package set.operacoesBasicas;

import java.util.Objects;

public class Word {

    private String words;

    public Word(String words){
        this.words = words;
    }

    public String getWords(){
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(words, word.words);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(words);
    }

    @Override
    public String toString() {
        return "Word{" +
                "words='" + words + '\'' +
                '}';
    }
}
