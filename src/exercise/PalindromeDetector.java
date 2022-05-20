    package exercise;

    public class PalindromeDetector {
        public boolean isPalindrome(String word) {
            return word.equalsIgnoreCase(reverse(word));
        }
        private String reverse(String word) {
            StringBuilder result = new StringBuilder();
            result.append(word).reverse();
            return result.toString();
        }
    }