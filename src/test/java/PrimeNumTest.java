import org.junit.jupiter.api.Test;

public class PrimeNumTest {

    @Test

    public void primeNumTest1() {
        boolean result = PrimeNumberMain.isPrimeNum(-1);
        System.out.println("-1 is a prime number: " + result);
    }

    @Test

    public void primeNumTest2() {
        boolean result = PrimeNumberMain.isPrimeNum(0);
        System.out.println("0 is a prime number: " + result);
    }

    @Test

    public void primeNumTest3() {
        boolean result = PrimeNumberMain.isPrimeNum(2);
        System.out.println("2 is a prime number: " + result);
    }

    @Test

    public void primeNumTest4() {
       boolean result= PrimeNumberMain.isPrimeNum(3);
        System.out.println("3 is a prime number: "+ result);
    }

    @Test

    public void primeNumTest5(){
        boolean result = PrimeNumberMain.isPrimeNum(4);
        System.out.println("4 is a prime number: " + result);
    }

    @Test

    public void primeNumTest6(){
        boolean result = PrimeNumberMain.isPrimeNum(99);
        System.out.println("99 is a prime number: " + result);
    }
}