package recursion2.recursion2_assignment;

// import java.util.Scanner;

public class Solution {

    public static boolean checkStringRule(String str) {
        if(str.length() == 0) {
            return true;
        }
        if(str.charAt(0) == 'a') {
            if(str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")){
                return checkStringRule(str.substring(3));
            } else {
                checkStringRule(str.substring(1));
            }
        }
        return false;
    }

    public static int countWays(int n) {
        if(n == 0){
            return 1;
        } else if(n < 0) {
            return 0;
        } else {
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(checkStringRule(str));
        // sc.close();

        System.out.println(countWays(4));
        
    }
    
}
