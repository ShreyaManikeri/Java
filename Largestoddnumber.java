public class Largestoddnumber {
    public static void main(String[] args) {

        String s={1,0,3,4,6,8,3,2};
        System.out.println(findString( s));
    }


    public static String findString(String s){
int last=s.length();
int index = -1;
       for(int i=last;i>=0;i++){
        if(s.charAt(i)-'0'%2==1){
            index=i;
            break;
        }

       }
if(index==-1){
    return "";
}
int i=0;
    while(i<=index && s.charAt(i)=='0') 
    {i++;}
        return s.substring(i, index);


        
    }
}
