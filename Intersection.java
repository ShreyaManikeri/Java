import java.util.ArrayList;

public class Intersection {
     public static void main(String args[]) {
                int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int arr2[] = {2, 3, 4, 4, 5, 11, 12};
                ArrayList<Integer> Inter = FindIntersection(arr1, arr2);
                System.out.println("Intersection of arr1 and arr2 is ");
                for (int val: Inter)
                    System.out.print(val+" ");
}
 static ArrayList<Integer> FindIntersection(int arr1[], int arr2[]) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > inter=new ArrayList<>(); // Uninon vector
        while (i < arr1.length && j < arr2.length) {
                //add ele. from 1st array
                if (arr1[i] < arr2[j]) // Case 1 and 2
                {
                    i++;
                }     
                //add ele. from 2nd array
                else if(arr1[i] > arr2[j]) // case 3
                {
                    j++;
                }
               else {
            // ✅ Match found: arr1[i] == arr2[j]
            if ( inter.isEmpty() ||  inter.get( inter.size() - 1) != arr1[i]) {
                 inter.add(arr1[i]); // Only add if it's not already added (to avoid duplicates)
            }
            i++;  // ✅ Move both pointers forward
            j++;  // ✅
        }
        }
        while (i <  arr1.length) // IF any element left in arr1
            {
                if ( inter.get( inter.size()-1) != arr1[i])
                inter.add(arr1[i]);
                i++;
            }
        while (j < arr2.length) // If any elements left in arr2
            {
                if ( inter.get(inter.size()-1) != arr2[j])
                 inter.add(arr2[j]);
                j++;
            }
        return inter ;
        }
    
}
