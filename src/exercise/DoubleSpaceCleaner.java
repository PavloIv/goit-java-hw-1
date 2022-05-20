package exercise;

public class DoubleSpaceCleaner {
    public String clean(String phrase){
        String cleaner = phrase;
        for (; cleaner.contains("  ") == true ;){
               cleaner = cleaner.replace("  ", " ");
        }
    return cleaner.strip();
    }
}
