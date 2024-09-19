import java.util.*;
public class tricky_program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bob = sc.next();
        String alice = sc.next();
        sc.close();
        char[] bob1 = bob.toCharArray();
        char[] alice1 = alice.toCharArray();
        int flag = 0;
        if(bob1.length != alice1.length){
            flag = 1;
        }
        else{
            for(int i = 0 ; i < bob1.length-1 ; i++){
                if(bob1[i+1] == '#'){
                    i++;
                    continue;
                }
                else if(bob1[i]!=alice1[i]){
                    flag++;
                }
            }
        }
        if(flag == 0){
            System.out.print("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

/*
Alice challenged Bob to write the same word as his on a typewriter. Both are kids and are making some mistakes in typing and are making use of the ‘#’ key on a typewriter to delete the last character printed on it.

An empty text remains empty even after backspaces. 

Input Format
The first line contains a string typed by Bob.

The second line contains a string typed by Alice.

Output Format
The first line contains ‘YES’ if Alice is able to print the exact words as Bob , otherwise ‘NO’.

Constraints
1 <= Bob.length

Alice.length <= 100000

Bob and Alice only contain lowercase letters and '#' characters.
*/