public class SearchInStrings {
    public static void main(String[] args) {
        String name="kunal";
        char target='u';
         char target1='s';
        System.out.println(search(name,target));
         System.out.println(searchInRange(name,target1,1,2));
    }
    static boolean search(String str,char target){
        if(str.length()==0){
         return false;
        }
        // for (int i = 0; i < str.length(); i++) {
        //     if(target==str.charAt(i)){
        //         return true;
        //     }
        // }
        //using for each loop instead of above
        for(char ch:str.toCharArray()){//convert sting into char array
            if(ch==target)
            return true;
        }
        return false;

    }

    //method if we have given the range
      static boolean searchInRange(String str,char target,int start,int end){
        if(str.length()==0){
         return false;
        }
        for (int i =start; i < end; i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
    
}
