import java.util.*;
class tricky_program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Pizza : ");
        int pizza = sc.nextInt();
        System.out.print("\nEnter no. of Puffs : ");
        int puffs = sc.nextInt();
        System.out.print("\nEnter no. of Drink : ");
        int drink = sc.nextInt();
        sc.close();

        System.out.println("Total Price :"+((pizza*100) + (puffs*20) + (drink*10)));
    }
}

/*
PROBLEM STATEMENT – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 
-----------------


Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:
--------------


Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5

Sample Output 1:
---------------

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290 
*/