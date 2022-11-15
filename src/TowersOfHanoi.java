/*
Rashaan, Cece, Derek and Nathan
11/15/2022
CS 145
Towers of Hanoi Assignment
TowersOfHanoi.java
 */

/*
This program prints instructions for solving the Towers of Hanoi puzzle.
 */

public class TowersOfHanoi {

    // solves for a puzzle with this number of disks
    private final static int DISKS = 4;

    public static void main(String[] args) throws Exception {
        playTowers(DISKS, 'A', 'B', 'C');
    }

    public static void playTowers(int n, char fromPeg, char auxPeg, char toPeg) throws Exception {
        if (n < 0) throw new IllegalArgumentException();
        // base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
        
        } else {
            // move disks on top to auxPeg
            playTowers(n - 1, fromPeg, toPeg, auxPeg);
            // move the bottom disk to the final peg
            System.out.println("Move disk " + n + " from " + fromPeg + " to " + toPeg);
            // move the disks that were on top back on top of the bottom disk
            playTowers(n - 1, auxPeg, fromPeg, toPeg);
        }
    }
}
