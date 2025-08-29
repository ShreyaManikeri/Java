import java.util.HashMap;

public class FruitBasketBT {
    //L5
   public static void main(String[] args) {
    int[] nums={3,3,3,1,2,1,2,3,3,4};
   System.out.println(subarrayLengthType(nums)) ;
   }

   public static int subarrayLengthType(int[] nums) {
    //better sol with inner while
    int l=0,r=0,len=0,maxlen=0;
    HashMap<Integer,Integer> mpp=new HashMap<>();
    while(r<nums.length){
        int num=nums[r];
        // Add current fruit to map
        mpp.put(num,mpp.getOrDefault(num, 0) + 1);
        //cond violets   // If we have more than 2 distinct fruits, shrink from left
        while(mpp.size()>2){ //better sol with inner while
              mpp.put(nums[l], mpp.get(nums[l]) - 1);
                if (mpp.get(nums[l]) == 0) { mpp.remove(nums[l]); }
             l++;
         }
         len=r-l+1;
         maxlen=Math.max(maxlen, len);
         r++;
   } 
return maxlen;
}

}
