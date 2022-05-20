package exercise;

public class PunctuationMarkCounter {
    public int count(String phrase){
        int j = 0;
        char[] pharses = phrase.toCharArray();
        for (int i = 0; i < pharses.length; i++){
            if (pharses[i] == '.' || pharses[i] == ',' || pharses[i] == '!' || pharses[i] == ':' || pharses[i] == ';') {
                j++;
            }
        }
        return j;
    }
}

