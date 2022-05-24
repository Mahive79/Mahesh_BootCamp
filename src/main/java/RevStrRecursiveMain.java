public class RevStrRecursiveMain {

    public static void printReverse(char[] ch, int length) {
        if (length > 0) {
            System.out.println(ch[length - 1]);
            length--;
            printReverse(ch, length);
        }
    }
}