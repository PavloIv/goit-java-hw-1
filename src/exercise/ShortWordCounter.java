package exercise;

public class ShortWordCounter {
    public int count(String phrase, int minLength){
        int j = 0;
        String[] counter = phrase.split(" ");
        for (int i = 0; i < counter.length; i++){
             if (counter[i].length() <= minLength){
                 j++;
             }
        }
return  j;
    }
}