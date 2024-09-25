import java.util.*;
public class PROBLEM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] arr = {9, -3, 8, -6, -7, 8, 10};
        Arrays.sort(arr);
        System.out.println(arr[n-1]+arr[n-2]);
    }
}

/*
PROBLEM 1 TCS 
A game company has designed an online lottery game. 
Bingo, in this game, N number cards are displayed. 
Each card has a value on it. The value can be negative or
 positive. The player must choose two cards. To win one game, the 
 product of the values of the two cards must be maximum value possible 
 for any pair of cards in the display. The winning amount will be the 
 sum of the two cards chosen by the player.
Write an algorithm to find the winning amount as the sum of the 
value of the cards whose product value is maximum.
INPUT:
7
9 -3 8 -6 -7 8 10

OUTPUT:
19
 */