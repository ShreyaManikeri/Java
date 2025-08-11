public class Leet387 {
    public static void main(String[] args) {
        
        String str="lleetcode";
        System.out.println(firstUniChar(str));

    }
    public static int firstUniChar(String str){
        int[] freq=new int[26];

        char[] c=str.toCharArray();
        for (char d : c) {
            freq[d-'a']++;
        }
        for (int i = 0; i < c.length; i++) {
            if(freq[c[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
    
}
