package exercise;

public class WordSplitter {
    public String[] split(String phrase){
       String [] sp =  phrase.split(" ");
       int k = 0;
       int j = 0;
       String [] wordSplit;
        for (int i = 0; i < sp.length; i++){
            if (sp[i].isEmpty()){
                continue;
            }
            j++;
        }
        wordSplit = new String[j];
        for (int i = 0; i < sp.length; i++){
            if (sp[i].isEmpty()){
                continue;
            }
            wordSplit[k] = sp[i].toLowerCase();
            k++;
        }
return wordSplit;
    }
}

