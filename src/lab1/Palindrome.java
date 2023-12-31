public class Palindrome {
    public static void main(String[] args) {
        String a = null;
        for (int i = 0; i < args.length; i++) {
            a = args[i];
            if (isPalindrome(a)) {
                System.out.println(a + " is Palindrome");
            }
            //System.out.println(isPalindrome(a));
        }

        //return isPalindrome(s);
    }

    public static String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}

//слово