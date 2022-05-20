package exercise;

public class WaterCounter {
    public double count(String text){
        char[] textChar = text.toCharArray();
        int numberP = 0;
        double counts;
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == ' '){
                numberP++;
            }
        }
        counts = (double) numberP / (double) text.length();
        return counts;
    }
}
