import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    float num;
    num=input.nextInt();
    float si=((num*10*1)/100);
    float total=(si+num);

    System.out.println((int)total);

    float emi=total/12;
    System.out.printf("%.2f",emi);
    
    } 
}
