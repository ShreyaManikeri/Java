public class Content3 {
     //overriding .equals() for Content comparision by using .equals() of string class & == op. Over simplified method
     String name;
    int rollno;
    public boolean equals(Object obj){
        if(this == obj)
        return true;
        if(obj instanceof Content3){
             Content2 s2=(Content2) obj;
            if(name.equals(s2.name) && rollno == s2.rollno)
                return true;
            else
              return false;
        }
        else
        return false;
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
