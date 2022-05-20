package exercise;

public class DigitText {
    public boolean detect(String text){
        byte[] charsNumber = new byte[text.length()];
        charsNumber = text.getBytes();
        int k = 0;
        for (int i = 0; i < charsNumber.length; i++){
        if (charsNumber[i] >= 48 && charsNumber[i] <= 57 || charsNumber[i] == 32){
            k = 0;
        }else {
            k++;
        }
        if (k != 0){
            return false;
        }
        }
        return true;
    }
}