import java.util.*;
public class tricky_program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = 4;
        int[] jackArr = {1, 0, 0, 0};
        int[] jillArr = {1, 0, 0, 0, 0};
        int[] dp = new int[10];
        int jackscore = 0 ; 
        int jillscore = 0 ;
        String turn = "Jack";
        int ind = 0;
        int round = 0;
        while(round != rounds){
            if(turn == "Jack"){
                int max = 0;
                round++;
                for(int i = 0 ; i < jackArr.length ; i++){
                    if(dp[i] != 1){
                        if(jackArr[i]>=max){
                            max = jackArr[i];
                            ind = i;
                        }
                    }
                }
                dp[ind]++;
                jackscore += max;
                
                turn = "Jill";
            }
            else{
                round++;
                int max = 0;
                for(int i = 0 ; i < jillArr.length ; i++){
                    if(dp[i] != 1){
                        if(jillArr[i]>=max){
                            max = jillArr[i];
                            ind = i;
                        }
                    }
                }
                dp[ind]++;
                jillscore += max;
                turn = "Jack";
            }
        }
        System.out.println(jackscore+","+jillscore);
    }
}
