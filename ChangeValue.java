import java.util.Arrays;
public class ChangeValue{

    public static void main(String[] args){
   
   //create an array
   int[] arr={1,3,2,45,6};
   change(arr);
   System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0]=99;//if you make change to the object via this obj ref var ,same object will be changed
    }
}