// Programmer: Sukhman Lally
// Class: CS145: Face to Face
// Date: 02/27/23
// Assignment: Towers of Hanoi - Lab 5
// Purpose: Using recursion to solve Towers of Hanoi problem
public class Main {
        static int count = 0;
    public static void main(String[] args) {
        int totalDiscs = 5; // how many discs will be stacked on the left tower initially
        solveTowers(totalDiscs, "Left", "Middle", "Right");

        System.out.println("\nA Tower of Hanoi problem with " + totalDiscs + " discs takes "
                + count + " moves to solve.");
    }

    public static void solveTowers(int discs, String left, String middle, String right) {
        if (discs == 1) {
            System.out.println("Disc 1 from " + left + " to " + right + ".");
            count++;
        } else {
            solveTowers(discs - 1, left, right, middle);
            count++;
            System.out.println("Disk " + discs + " from " + left + " to " + right + ".");
            solveTowers(discs - 1, middle, left, right);
        }
    }
}