import java.util.*;

public class tricky_program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        int maxDigit1 = findMaxDigit(input1);
        int maxDigit2 = findMaxDigit(input2);
        int maxDigit3 = findMaxDigit(input3);
        int maxDigit4 = findMaxDigit(input4);

        int sum = maxDigit1 + maxDigit2 + maxDigit3 + maxDigit4;

        System.out.println("Sum of max digits: " + sum);
    }

    public static int findMaxDigit(int number) {
        int maxDigit = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }
}

/*given 4 inputs input1, input2, input3, input4. We need to find the max digit from all inputs and sum them. Return the sum as 
 * output.
  
   INPUT:
        input1 = 7635
        input2 = 7448
        input3 = 3830
        input4 = 2346
        
    OUTPUT:
        7 + 8 + 8 + 6 = 29
 */