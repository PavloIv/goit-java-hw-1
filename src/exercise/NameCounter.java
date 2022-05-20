package exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameCounter {
    public int count(String text) {
        String[] wordsFromText = text.split(" ");
        int result = 0;
        Pattern p = null;
        for (int i = 0; i < wordsFromText.length; i++) {
            p = Pattern.compile("\\b[A-Z][a-z]");
            Matcher m = p.matcher(wordsFromText[i]);
            while (m.find()) {
                result++;
            }
        }
        return result;
    }
}
