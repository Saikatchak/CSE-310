import java.util.*;

public class exception1  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            int a=input.nextInt();
            int b=input.nextInt();
            int c=a/b;
            int arr[]=new int[5];
            arr[7]=9;
            System.out.println("result:"+c);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Exception caught:Division by zero");
        }
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println(e);
        //     System.out.println("Exception caught:out of bound");
        // }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Exception occured");
        }
        System.out.println("a");
    }
}
