public class RemoveDuplicates2 {
    public static void main(String[] args) {
       int nums[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(nums);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
     public static  int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
