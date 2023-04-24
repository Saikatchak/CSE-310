import java.util.*;
public class arraysum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int[] arr= new int[10];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        float sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        float avg=(sum/n);
        System.out.println(avg);
    }
}
