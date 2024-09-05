public class tricky_program7 {
    public static void main(String[] args) {
        int magicians = 10, num_of_attacks = 3;
        int[] power_of_magicians = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] scarlet_witch_power = {10, 10, 5};
        int flag = 0;
        for(int i = 0 ; i < scarlet_witch_power.length ; i++){
            int j = 0;
            //System.out.println("\n"+scarlet_witch_power[i]);
            for(j = 0 ; j < power_of_magicians.length ; j++){
                if(scarlet_witch_power[i]<power_of_magicians[j]){
                    flag++;
                    break;
                }
                if(scarlet_witch_power[i]>=power_of_magicians[j]){
                    scarlet_witch_power[i]-=power_of_magicians[j];
                    power_of_magicians[j] = 0;
                }
                else{
                    flag++;
                    break;
                }
                //System.out.print(power_of_magicians[j]+" ");
            }
            if(flag!=0){
                break;
            }
                for(int k = 0 ; k < power_of_magicians.length ; k++){
                    power_of_magicians[k]+=1;
                    //System.out.print(power_of_magicians[k]);
                }
        }
        int count = 0;
        for(int i = 0; i < power_of_magicians.length ; i++){
            if(power_of_magicians[i] != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
