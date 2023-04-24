import java.util.*;

public class exception3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        try{
            try{
                int ans=a/b;   
            }
            catch(ArithmeticException e){
                System.out.println("are exception");
            }
            try{
                int arr[]=new int[5];
                arr[6]=1;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("arr out of bound exception");
            }

        }
        // catch(Exception e){
        //     System.out.println("error occured");
        // }
        finally{
            System.out.println("done");
        }
    }
}
