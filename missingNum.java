public class missingNum {
//find the one missing number from the array
    public static void main(String[] args) {
        int N=5;
        int[] nums={1,2,4,5};
        // missingNumber(nums, N);
        System.out.println( missingNumber(nums, N));
    }
    static int missingNumber(int[] nums,int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<nums.length;i++){
            xor1=xor1^nums[i];
            xor2=xor2^(i+1);
        }
        xor2=xor2^n;
        return xor1^xor2;
    }
}
