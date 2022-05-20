package exercise;

public class EmailDetector {
    public boolean isPresent(String text){
    char[] textChar = text.toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '@'){
            if (textChar[i-1] != ' ' && textChar[i+1] != ' ' && textChar[i-2] != ' ' && textChar[i+2] != ' '){
                return true;
            }
            }
        }
    return false;
    }
}
