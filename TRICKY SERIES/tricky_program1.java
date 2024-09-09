//EXPAND THE STRING

import java.util.*;
public class tricky_program1 {
    public static void main(String[] args) {
        //GETTING INPUT FROM USER
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //STRING TO CHAR ARRAY CONVERION
        char[] ch = str.toCharArray();
        
        for(int i = 0 ; i < ch.length-1 ; i+=2){
            //STORE CHAR IN C AND NUMBER IN N.
            char c = ch[i];
            int n = (ch[i+1]-'0');

            //LOOPING
            while(n!=0){
                System.out.print(c);
                n--;
            }
        }
    }
}
