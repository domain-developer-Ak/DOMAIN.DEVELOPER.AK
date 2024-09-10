import java.util.*;
class pattern_star_program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

/*
    *****
    *****
    *****
    *****
    *****

    pattern - 1
 */