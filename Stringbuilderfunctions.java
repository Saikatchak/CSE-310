import java.io.*;
public class Stringbuilderfunctions {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("java program");
        System.out.println(s1);
        s1.append(" language");
        System.out.println(s1);
        s1.insert(5, "xyz");
        System.out.println(s1);
        s1.replace(0, 4, "abcd");
        System.out.println(s1);
        s1.delete(1, 4);
        System.out.println(s1);
        s1.reverse();
        

    }
}
