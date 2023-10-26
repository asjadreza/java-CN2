package recursion2;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        if(n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move (n-1) disks from source to helper peg using the destination peg as an helper peg
        towerOfHanoi(n - 1, source, destination, helper);
        // Move the remaining disks from source to destination peg 
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        // Move (n-1) disks from helper peg to destination peg using source peg as an helper peg
        towerOfHanoi(n - 1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 2; // Change the number of disks as needed
        char source = 'A';
        char auxiliary = 'B';
        char destination = 'C';

        towerOfHanoi(n, source, auxiliary, destination);
        
    }
    
}
