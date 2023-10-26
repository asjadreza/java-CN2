package recursion2;

public class Subsequences2 {
    // print subsequesnces
    public static void printSubsequences(String str, String outputSoFar) {
        if(str.length() == 0) {
            System.out.println(outputSoFar);
            return;
        }

        // we choose not to include the first char
        printSubsequences(str.substring(1), outputSoFar);
        // we chhose to include first char to the output string
        printSubsequences(str.substring(1), outputSoFar + str.charAt(0));
    }

    public static void printSubsequences(String str) {
        printSubsequences(str, "");
    }


    // print keypad combination
    public static void printKeypadCombination(int n, String outputSoFar) {
        if(n == 0) {
            System.out.println(outputSoFar);
            return;
        }
        int lastDigit = n % 10;
        char[] options =  numberOptions(lastDigit);
        for(int i = 0; i < options.length; i++) {
            printKeypadCombination(n/10, options[i] + outputSoFar);
        }
    }
    public static void printKeypadCombination(int n) {
        printKeypadCombination(n, "");
    }

    public static char[] numberOptions(int n) {
        switch (n) {
            case 2:
                char[] option2 = { 'a', 'b', 'c' };
                return option2;
            case 3:
                char[] option3 = { 'd', 'e', 'f' };
                return option3;
            case 4:
                char[] option4 = { 'g', 'h', 'i' };
                return option4;
            default:
                char[] option = { '\0' };
                return option;
            // we can write all the keypad combination till 9 down below
        }
    }
    public static void main(String[] args) {
        // printSubsequences("xy");        
        printKeypadCombination(234);
    }
    
}
