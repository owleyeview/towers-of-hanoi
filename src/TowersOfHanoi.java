public class TowersOfHanoi {

    public static void main(String[] args) throws Exception {
        int discs = 3;
        playTowers(discs, 'A', 'B', 'C');
    }

    public static void playTowers(int n, char from, char aux, char to) throws Exception {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            playTowers(n - 1, , , );
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            playTowers(n - 1, , , );
        }
    }
    
}
