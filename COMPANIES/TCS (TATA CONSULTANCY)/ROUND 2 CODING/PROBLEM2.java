import java.util.*;
public class PROBLEM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5, l = 2;
        int[] arr = {11, 81, 27, 72, 79};
        List<Integer> highRisk = new ArrayList<>();
        List<Integer> others = new ArrayList<>();

        for(int age:arr){
            if(age <= 10 || age>=81){
                highRisk.add(age);
            }
            else{
                others.add(age);
            }
        }
        int highdays = highRisk.size();
        int otherdays = others.size();
        int days = 0;
        if(highdays+otherdays % 2 != 0 || highdays+otherdays % 2 == 0){
            days = highdays + otherdays / l;
        }
        else if(highdays % 2 != 0 || otherdays % 2 != 0){
            days = highdays + otherdays + 1 / l;
        }
        System.out.println(days);
    }
}

/*
A new medicine named "Medio-cine" is out in the market which helps in treating auto-immune diseases in humans. 
These are very common in 0-10 year old kids or greater than or equal to 81 year old senior citizens. 
Both these age groups are considered at a very high risk.
The government wants to distribute the medicine as soon as possible among all age groups. 
There is only one(1) political center from where this medicine is distributed. Each
person requires only one capsule and there can be L capsules distributed in a day. The
high risk humans are supposed to be considered first. 
There are 'N'humans and 'L' capsules per day. 
Find the minimum number of days required to medicate all the Humans.


INPUT:
5 2
11 81 27 72 79

OUTPUT:
3
 */