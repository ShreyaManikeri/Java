public class Main{
    public static void main(String[] args){
        int[] arr={12,33,585,34,98,22};
        int target=34;
       int ans= linearsearch(arr, target);
          System.out.println(ans);
    }
//search in the array;return the index if the item is found
//otherwise,if item not found return -1
    static int linearsearch(int[] arr,int target){
        if(arr.length<0){
            return -1;
        }

        for(int index=0;index<arr.length;index++)
        {   //check for element at every index ,if it is =target
             int element=arr[index];
             if(element==target)
             {
                return index;
            }
        }
        //this line will execute if none of the above return statements have not executed
        //hence the target not found
    return -1;

    }
}