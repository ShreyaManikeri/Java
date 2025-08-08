import java.util.ArrayList;
import java.util.List;

public class Leet3 {
    public static void main(String[] args) {
        String str="abcdabcbb";
        int left=0;
        int right=0;
        int maxLength=0;
        List<Character> l=new ArrayList<Character>();
        while(right<str.length()){

            if(!l.contains(str.charAt(right))){
                l.add(str.charAt(right));
                right++;
                maxLength=Math.max(maxLength, l.size());
            }
            else{
                l.remove(Character.valueOf(str.charAt(right)));
                left++;
            }
        }
   System.out.println(" "+maxLength);
    }
}
