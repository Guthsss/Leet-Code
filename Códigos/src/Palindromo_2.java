public class Palindromo_2 {
    public boolean isPalindrome(int x) {
        String text = x + "";
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}