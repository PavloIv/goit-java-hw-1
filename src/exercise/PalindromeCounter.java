package exercise;

public class PalindromeCounter {
    public int count(String phrase){
        String[] polCount = phrase.split(" ");
        StringBuilder reverse = new StringBuilder();
        String reversWord = "";
        int count = 0;
        for (int i = 0; i < polCount.length; i++){
             char[] inputReverseWord = polCount[i].toCharArray();
             int begin = 0;
             int end = inputReverseWord.length-1;
             char temp;
             while (begin < end){
                 temp = inputReverseWord[begin];
                 inputReverseWord[begin] = inputReverseWord[end];
                 inputReverseWord[end] = temp;
                 begin++;
                 end--;
             }
            reversWord = new String(inputReverseWord);
             if (reversWord.toLowerCase().equals(polCount[i].toLowerCase())){
                 count++;
             }
        }
        return count;
    }
}