import java.util.*;
public class displaydouble {

    public static void main(String[] args) {
        int z;
        Scanner input=new Scanner(System.in);
        z=input.nextInt();
        if(z>=0){
            System.out.println((Double.valueOf(z)));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    
}

