public class SecondMax {
   
    public static void main(String[] args) {
         int[] arr={11,33,585,34,98,5};
        System.out.println( second(arr));
    }
    //method for finding second max value from the array
    static int second(int[] arr){

         int maxi = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

         if(arr[i]>maxi){
            secondMax=maxi;
            maxi=arr[i];
         }
         else if (arr[i]> secondMax && arr[i] != maxi) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    
}

