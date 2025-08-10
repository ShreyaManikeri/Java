import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String str1="peek";
        String str2="keep";
        if(isAnagrams(str1,str2)){
            System.out.println(str1+" and "+str2+" are anagrams");
        }
        else
        {
            System.out.println(str1+" and "+str2+" are not anagrams");
        }


    }
    //pgm to check if two strings are anagrams
    //strings with same char. with same frequency
    public static boolean isAnagrams(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            return true;
        }
        else 
        return false;
    }
}
