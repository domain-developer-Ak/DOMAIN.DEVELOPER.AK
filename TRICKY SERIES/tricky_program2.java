import java.util.*;
public class tricky_program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        //CHECKS IF PRIME NUMBER OR NOT
        int output1 = prime(n);
        if(output1 == 1){

            //SUM OF DIGITS 
            int sum = 0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            output1 = prime(sum);

            //IF NUMBER IS PRIME CHECKS GOOGLY PROPERTY
            if(output1 == 1){
                System.out.println("Googly Number");
            }
            else {
                System.out.println("Not a Googly Number");
            }
        }
    }

    //METHOD TO CHECK IF PRIME OR NOT
    public static int prime(int m){
        int flag = 0;
        for(int i = 2 ; i <= m/2 ; i++){
            if(m%i==0){
                flag++;
                System.out.println("Not a Googly Number");
                return 0;
            }
        }
        return 1;
    }
}
