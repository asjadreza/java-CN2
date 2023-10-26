package patterns;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Pattern {
    public static void printDiamond() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            int j = 1;
            while(j <= n - 1) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while(j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }

    public static void printDiamond1() {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n - i){
                System.out.print(" ");
                j++;
            }
            
            j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
	}


    // another pattern
    public static void pattern1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            int j = 1;
            while(j <= n -1) {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }


    public static void main(String[] args) {
        // printDiamond();
        // printDiamond1();\
        pattern1();
    }
    
}
