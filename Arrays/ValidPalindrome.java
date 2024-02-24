package Arrays;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[\\s,;:.!\"'`?@#$%^&*()\\[\\]{}<>+=_|\\\\/-]", "").toLowerCase();;
        int l = s1.length();
        for (int i = 0; i < l/2; i++) {
            if (s1.charAt(i) != s1.charAt(l-i-1)) {
                return false;
            }
        }
        return true;
    }
}
