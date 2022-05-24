public class SwapNumWoThirdVariable {

    public static void swapNum(String string1, String string2) {
        System.out.println("Before Swap: " + "Value of string1 is - " + string1);
        System.out.println("Before Swap: " + "Value of String2 is - " + string2);
        string1=string1+string2;
        string2= string1.substring(0, (string1.length()-string2.length()));
        string1=string1.substring(string2.length());
        System.out.println("After Swap: Value of String1 is - "+ string1);
        System.out.println("After swap: Value of String2 is - " + string2);
    }
}