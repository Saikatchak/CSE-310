import java.util.*;
public class exceptionq1 {
    public static void pass(String a){
        if(a.length()>=8){
            Boolean c=false;
            for(int i=0;i<a.length();i++){
                if(Character.isDigit(a.charAt(i))){
                    c=true;
                    break;
                }

            }
            if(c==true){
                System.out.println("passward is okay");
                return;
            }
            System.out.println("passward is not okay");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter passward :");
        String s=input.nextLine();
        pass(s);
    }
}
