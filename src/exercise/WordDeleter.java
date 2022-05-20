package exercise;

public class WordDeleter {
    public String remove(String phrase, String[] words){
        String result = "";
        String[] remover = phrase.split(" ");
        for (int i = 0; i < remover.length; i++){
            int k = 0;
            for (int j = 0; j < words.length; j++){
                if (remover[i].equals(words[j].strip())){
                k++;
                }
            }
            if (k == 0) {
                result += remover[i] + " ";
            }
        }
return result.strip();
    }
}