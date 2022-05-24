import org.junit.jupiter.api.Test;

public class PalindromeTest {


    @Test
    public void palindromeTest1() {

        PalindromeMain.isPalindrome("MADAM");
    }

    @Test
    public void palindromeTest2() {

        PalindromeMain.isPalindrome("KATE");
    }

    @Test
    public void palindromeTest3() {
        PalindromeMain.isPalindrome("13131");
    }
}