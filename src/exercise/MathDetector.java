package exercise;

public class MathDetector {
    public boolean isMath(String text){
        if (text.contains("=") || text.contains("+") || text.contains("-") || text.contains("*") || text.contains("/")){
            return true;
        }else {
            return false;
        }
    }
}