package exercise;

import java.util.Arrays;

public final class Phrase {
    private final String[] words;
    public String[] word;
    public  Phrase( String[] words) {
        this.words = words;
        word = Arrays.copyOf(words, words.length);
    }
    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < word.length; i++){
            result +=  word[i] + " ";
        }
        return result;
    }
}

