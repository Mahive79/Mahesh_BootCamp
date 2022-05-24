public class PalindromeMain {

    public static void isPalindrome(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            str1 += str.charAt(i);
        }
        if (str.equals(str1)) {
            System.out.println("The given string " + str + " is a palindrome");
        } else
            System.out.println("The given string " + str + " is not a palindrome");
    }
}