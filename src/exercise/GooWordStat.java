package exercise;

public class GooWordStat {
    private String word;
    private int freq;
    public String norm;
    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }
    public String getWord() {
        return word;
    }
    public int getFreq() {
        return freq;
    }
    public String norm(){
        if(freq < 1000) {
            norm = "LOW";
        }else if(freq < 100000) {
            norm = "MEDIUM";
        }else if (freq < 10000000) {
            norm = "HIGH";
        }else {
            norm = "EXTRA HIGH";
        }
        return norm;
    }
    @Override
    public String toString(){
        return "Word is [" + word + "], search freq is " + norm();
    }
}

