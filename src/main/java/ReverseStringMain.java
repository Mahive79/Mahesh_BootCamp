public class ReverseStringMain {

    public static void revString(String str, String rStr){
        for (int i = str.length() - 1; i >= 0; --i) {
            rStr += str.charAt(i);
        }
        System.out.println("The Original String: " + str);
        System.out.println("The Reverse String: " + rStr);
    }

    public static void main(String[] args) {

        ReverseStringMain.revString("Shital", "");
    }


}