
import java.io.*;
import java.util.*;


public class exceptionhac1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        try{
            int a=input.nextInt();
            int b=input.nextInt();
            try{
                int ans=a/b;
            }

            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}
