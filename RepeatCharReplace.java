import java.util.HashMap;

public class RepeatCharReplace {
    public static void main(String[] args) {
        String str="AAABBCCD";
        int k=2;
        System.out.println(substringLength(str,k));
    }

    public static int substringLength(String str, int k) {
       int l=0,r=0,maxlen=0,maxFreq=0;
       HashMap<Character,Integer> count=new HashMap<>();

       while (r<str.length()) {
        char ch=str.charAt(r);
        //add the count of alphabets in map
        count.put(ch, count.getOrDefault(ch,0)+1);
        

        maxFreq=Math.max(maxFreq, count.get(str.charAt(r)));
    // shrink if more than k replacements needed// formula for valid substrings
            while((r-l+1)-maxFreq > k){
                //decrese the count of alpha at the l th index
                count.put(str.charAt(l),count.get(str.charAt(l)-1));
                l++;
            }
              // correct window length after possible shrinking
            maxlen=Math.max(maxlen,(r-l+1));
             r++;
       }
    return maxlen;
    }

}
