import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class FizzBuzzTest {
    FizzBuzzMain fizz_test= new FizzBuzzMain();

    @Test
    public void fizzTest(){
        String fizz=fizz_test.fizzBuzz(3);
        Assert.assertEquals(fizz, "FIZZ");
    }

    @Test
    public void buzzTest(){
        String buzz=fizz_test.fizzBuzz(5);
        Assert.assertEquals(buzz, "BUZZ");
    }

    @Test
    public void fizzbuzzTest(){
        String fizzbuzz= fizz_test.fizzBuzz(15);

        Assert.assertEquals(fizzbuzz, "FIZZ-BUZZ");    }
    @Test
    public void notFizzBuzz(){
        String notAfizzbuzz= fizz_test.fizzBuzz(11);
        Assert.assertEquals(notAfizzbuzz, "11");
    }
}