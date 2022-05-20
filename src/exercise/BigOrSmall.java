package exercise;

public class BigOrSmall {
    public String calculate(String text){
        byte[] charsNumber = new byte[text.length()];
        charsNumber = text.getBytes();
        int b = 0;
        int l = 0;
        for (int i = 0; i < charsNumber.length; i++){
            if (charsNumber[i] >= 65 && charsNumber[i] <= 90){
                b++;
            }
            if (charsNumber[i] >= 97 && charsNumber[i] <= 122){
                l++;
            }
        }
        if (b > l){
            return "Big";
        }else if (b < l){
            return "Small";
        }else {
            return "Same";}
    }
}
