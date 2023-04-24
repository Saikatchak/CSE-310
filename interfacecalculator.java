import java.util.*;

interface add_sub{
    void add(double x, double y);

    void sub(double x, double y);
}

interface mul_div{
    void mul(double x,double y);

    void div(double x,double y);
}

interface calculate extends add_sub,mul_div{
    default void print(double res){
        System.out.println(res);
    }
}

class calcuator implements calculate{
    public void add(double x,double y){
        print(x+y);
    }
    public void sub(double x,double y){
        print(x-y);
    }
    public void mul(double x,double y){
        print(x*y);
    }
    public void div(double x,double y){
        double j=x/y;
        print(j);
    }
}

public class interfacecalculator {
    public static void main(String args[]) {
        MyCalculator c = new MyCalculator();
        c.add(7.5, 8.3);
        c.sub(7.5, 8.3);
        c.mul(7.5, 8.3);
        c.div(7.5, 8.3);
        }
}


//create a inteface vehichle with 3 abstract methods void gearchange(int x),void speedincrease(int x),void breaks(int x) 
//create 2 classes bike car implementing the interface vehicle you can include addiitional data members and member function in the class 
//print the final speed,gear of bike and car