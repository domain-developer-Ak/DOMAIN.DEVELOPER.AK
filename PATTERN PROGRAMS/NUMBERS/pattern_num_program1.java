import java.util.*;
class pattern_num_program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int pr = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                while (!isPrime(pr)) {
                    pr++;
                }
                System.out.print(pr + " ");
                pr++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int pr) {
        if (pr < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(pr); i++) {
            if (pr % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*Write a program to print right angle triangle pattern with prime numbers.
  
 INPUT :
        5
 OUTPUT:
        2
        3 5
        7 11 13 
        17 19 23 29 
        31 37 41 43 47
 */