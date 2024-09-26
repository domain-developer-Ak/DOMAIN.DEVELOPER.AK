public class tricky_program18 {
    public static void main(String[] args) {
        int[] arr = {102, 101, 5, 7, 99, 1, 2, 3};
        int sum = arr[0];
        int max = sum;
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i+1]>arr[i]){
                sum += arr[i+1];
                if(sum>max){
                max = sum;}
            }
            else{
                sum = arr[i+1];
            }
        }
        System.out.println(max);
    }
}
