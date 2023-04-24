import java.util.*;
public class binarytoalphabet {
    public static void main(String[] args) {
        int code;
        Scanner input=new Scanner(System.in);
        code=input.nextInt();
        int sum=0;
        int n=0;
        while(code>0){
            int temp=code%10;
            sum+= temp*Math.pow(2, n);
            code=code/10;
            n++;
        } 
        if(sum>=65 && sum<=90){
            String str=Character.toString(sum);
            System.out.println(str);
        }
        else{
            System.out.println("INVALID PAPER CODE");
        }
    }
    
}
