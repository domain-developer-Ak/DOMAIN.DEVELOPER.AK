import java.util.*;
public class tricky_program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //STRING DECLARATION
        String str = sc.next();

        //METHOD CALLING
        boolean n = isValid(str);
        if(n){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Invalid Parenthesis");
        }
    }


    public static boolean isValid(String s) {
        //CHECKS IF LESS THAN 2
        if(s.length()%2 != 0) return false;

        //STACK IS DEVELOPED
        Stack<Character> stack= new Stack();

        //LOOPING TO PUSH AND POP IN STACK
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(ch == ')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(ch == ']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else if(ch == '}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
