/*TCS LEETCODE PROBLEM 
 * 344.   REVERSE THE STRING
 */

import java.util.*;
public class tricky_program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        reverseString(ch);
        System.out.print(new String(ch));
    }

    public static void reverseString(char[] s) {
        int min = 0;
        int max = s.length-1;
        while(min<max){
            char temp = s[min];
            s[min] = s[max];
            s[max] = temp;
            min++;
            max--;
        }
    }
}
