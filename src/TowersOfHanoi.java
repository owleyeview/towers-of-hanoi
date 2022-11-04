public class TowersOfHanoi {

    public static void main(String[] args) throws Exception {
        int discs = 3;
        playTowers(discs, 'A', 'B', 'C');
    }

    public static void playTowers(int n, char fromPeg, char auxPeg, char toPeg) throws Exception {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
        } else {
            playTowers(n - 1, fromPeg, toPeg, auxPeg);
            System.out.println("Move disk " + n + " from " + fromPeg + " to " + toPeg);
            playTowers(n - 1, auxPeg, fromPeg, toPeg);
        }
    }
}
