public class Content1 {
    //overriding .equals() for Content comparision by using .equals() of string class & == op. lenthy method
    String name;
    int rollno;
    Content1(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
   public boolean equals(Object obj){
        try{
            String name1=this.name;
            int rollno1=this.rollno;
            Content1 s2=(Content1) obj;

            String name2=s2.name;
            int rollno2=s2.rollno;

            if(name1.equals(name2) && rollno1 == rollno2){
                return true;
            }
            else
            return false;
        }
        catch(NullPointerException n){
            return false;
        }
        catch(ClassCastException n){
            return false;
        }
            
    }
    public static void main(String[] args) {
         Content1 s1=new Content1("shreya", 34);
        Content1 s2=new Content1("swati", 35);
       Content1 s3=new Content1("shreya", 34);
        Content1 s4=s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
    }
}
