public class tricky_program19 {
    public static void main(String[] args) {
        int N = 10;
        int R = countWays(N);
        System.out.println("Total ways to make " + N + " using 1 and 2 rupee coins: " + R);
    }

    public static int countWays(int N) {
        int out = 0;
        for (int y = 0; y <= N / 2; y++) {
            int x = N - (2 * y);
            out++;
        }

        return out;
    }
}


/*
 
 */