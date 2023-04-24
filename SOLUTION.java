import java.io.*;
import java.util.*;



public class SOLUTION {
    public static boolean prime(int a){
        if(a==1){
            return false;
        }
        int c=0;
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                c++;
            }
        }
        if(c>0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<1;i++){
            for(int j=0;j<5;j++){
                for(int k=0;k<j;k++){
                        boolean b1=prime(arr[j]);
                        if(b1==true){
                            System.out.println(arr[j]);
                        }

                }
            }
        }

        
        
    }
}
