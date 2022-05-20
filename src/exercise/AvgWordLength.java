package exercise;

public class AvgWordLength {
    public double count(String phrase){
        double result;
        int temp = 0;
        int number = 0;
        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++){
            temp += words[i].length();
            number = i + 1;
        }
        result = (double) temp / (double) number;
        return result;
    }
}