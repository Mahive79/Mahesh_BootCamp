public class FizzBuzzMain {

    public String fizzBuzz(int n) {
        if (n % 15 == 0) {

//        if (n % 3 == 0 && n % 5 == 0) {
            return ("FIZZ-BUZZ");
        } else if (n % 3 == 0) {
            return ("FIZZ");
        } else if (n % 5 == 0) {
            return ("BUZZ");
        } else {
            return (Integer.toString(n));
        }
    }
}