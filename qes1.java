//write a program to divivde 2 integer number divide it and print the output

import java.util.*;

public class qes1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        try{
            int c=a/b;
            System.out.println("result:"+c);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        }
        // try{
        //     if(b==0){
        //         throw b;
        //     }
        //     int c=a/b;
        //     System.out.println("result:"+c);
        // }
        // catch (int e) {
        //     System.out.println("Exception caught:Division by zero");
        // }

    }
}
