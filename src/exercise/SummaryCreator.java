package exercise;

public class SummaryCreator {
    public String create(String text){
        if (text.length() <= 15){
            return text;
        }
        if (text.length() >= 16 && text.charAt(15) == ' '){
            return text.substring(0,15);
        }else {
            return text.substring(0,15) + "...";
        }

    }
}