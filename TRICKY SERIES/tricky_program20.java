public class tricky_program20 {
    public static void main(String[] args) {
        int n = 132;
        int[] arr = {1, 5, 2, 4, 6, 7, 8, 9, 3, 5};
        String s = Integer.toString(n);
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i < ch.length ; i++){
            int index = Character.getNumericValue(ch[i]);
            if(arr[index] > index){
                ch[i] = Character.forDigit(arr[index], 10);
            }
        }
        
        s = new String(ch);
        System.out.println(s);
    }
}


/*
QUESTION:
--------
    You are given an integer. You'll also be given an array "Digits of size"
exactly 10 where each element of the array will be between 0-9 inclusive. 
You can perform the followning operations on the given integer 'num' at most once.

You can select a continous part of 'num' and name it 'x'. For each digit 'D' in num 'arr'
you can change it to digits[D].
You need to convert the given integer 'num' to a maximum possible number after performing 
the given operation at most once.

INPUT:
132
{1, 5, 2, 4, 5, 3, 6, 7, 5, 8}

OUTPUT:
542 
 */