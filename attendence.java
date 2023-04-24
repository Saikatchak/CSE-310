import java.util.*;
public class attendence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float total=input.nextInt();
        float attended=input.nextInt();

        float per=((attended/total)*100);
        System.out.println(per);

        if(per>=75){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
}
