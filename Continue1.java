public class Continue1 {
    public static void main(String[] args) {
        //print number between 1 to 20 except multiple of 3
        for(int i=1;i<20;i++){
            if(i%3==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
