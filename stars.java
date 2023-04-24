import java.util.*;
public class stars {
    public static void main(String[] args) {
        float z;
        Scanner input=new Scanner(System.in);
        z=input.nextFloat();
        if(z>=0 || z<=5){
            System.out.println("Thanks");
        }
        else{
            System.out.println("Error: 101");
        }
    }
    
}
