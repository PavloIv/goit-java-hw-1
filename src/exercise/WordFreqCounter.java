package exercise;

public class WordFreqCounter {
    public float countFreq(String phrase, String word){
        String[] pharsed = phrase.toLowerCase().split(" ");
        int j = 0;
        int i = 0;
        float k;
        for (; i < pharsed.length; i++){
            if (pharsed[i].equals(word.toLowerCase())) {
                j++;
            }
        }
        k = (float) j /(float) i;
        return k;
    }
}
