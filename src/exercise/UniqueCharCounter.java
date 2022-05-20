package exercise;

public class UniqueCharCounter {
    public int count(String phrase){
        int counts = 0;
        char [] symbols = phrase.toCharArray();
        for (int i = 1; i < symbols.length; i++){
            int k = 0;
            for (int j = i-1; j >= 0; j--){
                if (symbols[i] == symbols[j]){
                    k++;
                }
            }
            if (k == 0){
                counts++;
            }
        }
    return counts+1;
    }
}