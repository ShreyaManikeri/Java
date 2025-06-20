public class MaxWealth {
    public static void main(String[] args) {
         int[][] arr={
            {10,22,44},
            {100,67},
            {34,88}
        };
        System.out.println(maximumwealth(arr));
        
    }
    public static int maximumwealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        //person=row  &   acc=col
        for (int person = 0; person < accounts.length; person++) {
                 int sum=0;
            for (int acc = 0; acc < accounts[person].length; acc++) {
                sum += accounts[person][acc];
            }
            if(sum>ans){
                ans=sum;
            }
        }
   return ans;
    }
}
