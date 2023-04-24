import java.util.*;
public class string1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1=input.nextLine();
        int k=s1.indexOf(' ');
        System.out.println(s1.substring(k+1,s1.length()));
         
    }
}
