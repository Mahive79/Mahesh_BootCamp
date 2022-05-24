import org.testng.annotations.Test;

public class RevStrRecursiveTest {

    @Test
    public void revStrRecTest1() {
        String str = "GOOD";
        char[] ch = str.toCharArray();
        int length = ch.length;
        RevStrRecursiveMain.printReverse(ch, length);
    }

    @Test
    public void revStrRecTest2() {
        String str = "G";
        char[] ch = str.toCharArray();
        int length = ch.length;
        RevStrRecursiveMain.printReverse(ch, length);
    }
}