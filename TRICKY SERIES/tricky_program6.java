public class tricky_program6 {
    public static void main(String[] args){
        int n = 6;
        int out = fact(n);
        while(out!=0){
            if(out%10 != 0){
                System.out.print(out%10);
                break;
            }
            else{
                out/=10;
            }
        }
    }
    public static int fact(int a){
        int n = 1;
        while(a!=0){
            n*=a;
            a--;
        }
        return n;
    }
}
