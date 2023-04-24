import java.util.*;
public class joinusingdelaminator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();

        System.out.println(String.join(" ","My","Name","is",str));
    }
}
