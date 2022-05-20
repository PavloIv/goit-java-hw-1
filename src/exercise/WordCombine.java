package exercise;

import java.util.Locale;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        String sourseWordUnic = sourceWord.replaceAll( "(.)(?=.*?\\1)" , "" ).toLowerCase(Locale.ROOT);
        String targetWordUnic = targetWord.replaceAll( "(.)(?=.*?\\1)" , "" ).toLowerCase();
        byte[] charsNumberSWU = new byte[sourseWordUnic.length()];
        byte[] charsNumberTWU = new byte[targetWordUnic.length()];
        charsNumberSWU = sourseWordUnic.getBytes();
        charsNumberTWU = targetWordUnic.getBytes();
        int k = 0;
        for (int i = 0; i < sourseWordUnic.length(); i++){
            for (int j = 0; j < targetWordUnic.length(); j++) {
                if (charsNumberSWU[i] == charsNumberTWU[j]){
                    k++;
                }
            }
        }
        if (k == targetWordUnic.length()){
            return true;
        }else {
            return false;
        }
    }
}