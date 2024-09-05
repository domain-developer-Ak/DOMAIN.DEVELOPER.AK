import java.util.*;
public class tricky_program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int r1 = 3;
        int r2 = 9;
        int r3 = 8;
        int l = 0;
        if(r2<n)
        {
            while(n>=r2){
                l++;
                n= n - (r2-r3);
            }
        }
        if(r1<n){
            while(n>r1){
                l++;
                n-=r1;
            }
        }
        System.out.println("The max liters are "+l);
    }
}
/*Given N Rupees. A liter plastic bottle of milk costs R1 Rupees and a liter of the glass 
 * bottle of milk costs R2 Rupees. But the empty glass bottle after buying can be exchanged for R3 Rupees.
 * find the maximum liters of milk which can be bought with N Rupees.
 */