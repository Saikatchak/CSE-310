import java.util.*;
interface fact{
    boolean valid(String str,int n);
}
public class lambda2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String st=input.nextLine();
        int n=input.nextInt();
        if(n<1){
            System.out.println("Invalid input");
        }
        else{
        fact f1;
        f1=(x,y)->{
            int len=x.length();
            if(len>y){
                return true;
            }
            else{
                return false;
            }
        };
        String s=f1.valid(st, n)?"Valid string":"Invalid string";
        System.out.println(s);
    }
    }
}