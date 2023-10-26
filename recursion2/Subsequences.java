package recursion2;

public class Subsequences {

    public static String[] findSubsequences(String str) {
        if (str.length() == 0) {
            String[] ans = { "" };
            return ans;
        }

        String[] smallAns = findSubsequences(str.substring(1));
        String[] ans = new String[2 * smallAns.length];

        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            // ans[i+smallAns.length]
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }

    // find keypad combination
    public static String[] findKeypadComb(int n) {
        if (n == 0) {
            String[] ans = { "" };
            return ans;
        }

        int lastDigit = n % 10;
        int smallerNumber = n / 10;
        String[] smallAns = findKeypadComb(smallerNumber);
        char[] options = numberOptions(lastDigit);
        String[] ans = new String[smallAns.length * options.length];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            for (int j = 0; j < options.length; j++) {
                ans[k] = smallAns[i] + options[j];
                k++;
            }
        }
        return ans;

    }

    // another method just reverse the loops
    public static String[] findKeypadComb2(int n) {
        if (n == 0) {
            String[] ans = { "" };
            return ans;
        }

        int lastDigit = n % 10;
        int smallerNumber = n / 10;
        String[] smallAns = findKeypadComb(smallerNumber);
        char[] options = numberOptions(lastDigit);
        String[] ans = new String[smallAns.length * options.length];
        int k = 0;

        for (int j = 0; j < options.length; j++) {
            for (int i = 0; i < smallAns.length; i++) {
                ans[k] = smallAns[i] + options[j];
                k++;
            }
        }
        return ans;

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
        // String str = "xyz";
        // String[] ans = findSubsequences(str);
        // for(int i = 0; i < ans.length; i++) {
        // System.out.println(ans[i]);
        // }

        int num = 23;
        String[] ans = findKeypadComb(num);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}
