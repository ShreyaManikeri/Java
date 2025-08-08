public class PalindromString {
    public static void main(String[] args) {
        String str="level";

        String newStr="";
        for(int i=str.length()-1;i>=0;i--){
            newStr=newStr+str.charAt(i);
        }
        if(newStr.toLowerCase().equals(str.toLowerCase())){
                System.out.println("yes");
            }
            else
            System.out.println("No");

    }
}
