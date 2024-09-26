import java.util.*;
public class tricky_program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "a1b2c3df7";
        char[] ch = str.toCharArray();
        int min = 0;
        int max = ch.length-1;
        while(min<=max){
            if(min==max){
                break;
            }
            else if((ch[min]>='a' && ch[min]<='z') && (ch[max]>='a' && ch[max]<='z')){
                char temp = ch[min];
                ch[min] = ch[max];
                ch[max] = temp;
                min++;
                max--;
            }
            else {
                if (!(ch[min] >= 'a' && ch[min] <= 'z')) {
                    min++;
                }
                if (!(ch[max] >= 'a' && ch[max] <= 'z')) {
                    max--;
                }
            }
        }
        str = new String(ch);
        System.out.println(str);
    }
}

/*
 Given a string with alpha numeric values.
 Reverse only the alphabets from the string.

 INPUT:
 a1b2c3df7

 OUTPUT:
 f1d2c3ba7
 */