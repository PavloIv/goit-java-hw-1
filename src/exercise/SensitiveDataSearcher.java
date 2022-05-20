package exercise;

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        if (phrase.toLowerCase().contains("pass") || phrase.toLowerCase().contains("key") || phrase.toLowerCase().contains("login") || phrase.toLowerCase().contains("email")){
            return true;
    }else {
        return false;
    }
    }
}