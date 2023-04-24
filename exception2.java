import java.util.*;

public class exception2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        try{
            try{
                int ans=a/b;   
            }
            catch(NullPointerException e){
                System.out.println("null point exception");
            }
        }
        catch(Exception e){
            System.out.println("error occured");
        }
        finally{
            System.out.println("done");
        }
    }
}
