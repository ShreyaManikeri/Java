import java.lang.Math;
public class EvenDigits {
    public static void main(String[] args) {
        int[] num={12,33,585,34,98,22,-9999};
        //System.out.println(findNumbers(num));
        System.out.println(digits(124));

    }
    
    static int findNumbers(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }
    //function to check whether a num contains even digit or not
    static boolean even(int num){
        int noOfDigits=digits(num);
        return noOfDigits%2==0;
    }

    //count number of digits in a number
    static int digits(int num){
        if(num<0){
            num=num* -1;
        }
            int count1=0;
          while(num>0){
            num=num/10;
            count1++;
        }
         return count1;
         //return (int)(Math.log10(num)) + 1; //for faster

    }
}
