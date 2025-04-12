public class New {
    int a=200;
    int b=100;
    public void m1(int a ,int b){
   System.out.println(a+b);
   System.out.println(this.a+this.b);
    }
    public static void main(String[] args) {
        New t=new New();
        t.m1(10,20);
    }
}
