public class FindMinMax {
    public static void main(String[] args) {
         int[] arr={11,33,585,34,98,5};
       System.out.println( min(arr));
        System.out.println( max(arr));
    }

    //method for finding min value from the array
    static int min(int[] arr){
         int mini=arr[0];
        for (int i = 0; i < arr.length; i++) {
         if(arr[i]<mini){
            mini=arr[i];
         }
        }
        return mini;
    }
    
    //method for finding max value from the array
    static int max(int[] arr){
         int maxi=arr[0];
        for (int i = 0; i < arr.length; i++) {
         if(arr[i]>maxi){
            maxi=arr[i];
         }
        }
        return maxi;
    }
    
}
