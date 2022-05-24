import org.junit.jupiter.api.Test;

public class StringLengthTest {

    @Test
    public void strLengthTest1(){
        String strInput = "GOOD";
        System.out.println("Length of the String - " + strInput + " is: " + StringLengthMain.stringLength(strInput));
    }

    @Test
    public void strLengthTest2(){
        String strInput="G";
        System.out.println("Length of the String - " + strInput + " is: " + StringLengthMain.stringLength(strInput));
    }
    @Test
    public void strLengthTest3(){
        String strInput="Test200";
        System.out.println("Length of the String - " + strInput + " is: " + StringLengthMain.stringLength(strInput));
}
}