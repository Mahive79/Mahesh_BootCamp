public class StringLengthMain {

    public static int stringLength(String str) {
        int count = 0;
        for (char s : str.toCharArray()) {
            count++;
        }
        return count;

    }
}