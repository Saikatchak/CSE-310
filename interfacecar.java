//create a inteface vehichle with 3 abstract methods void gearchange(int x),void speedincrease(int x),void breaks(int x) 
//create 2 classes bike car implementing the interface vehicle you can include addiitional data members and member function in the class 
//print the final speed,gear of bike and car

interface vehicle{
    void gearchange(int x);
    void speedincrease(int x);
    void breaks(int x);
}
class bike implements vehicle{
    int gear;
    int speed;
    int brk;
    public void gearchange(int x){
        gear=x;
    }
    public void speedincrease(int x){
        speed=x;
    }
    public void breaks(int x){
        brk=x;
    }
    void print(){
        System.out.println("Gear: "+gear);
        System.out.println("Speed increase: "+speed);
        System.out.println("breaks: "+brk);
    }
}

class car implements vehicle{
    int gear1;
    int speed1;
    int brk1;
    public void gearchange(int x){
        gear1=x;
    }
    public void speedincrease(int x){
        speed1=x;
    }
    public void breaks(int x){
        brk1=x;
    }
    void print(){
        System.out.println("Gear: "+gear1);
        System.out.println("Speed increase: "+speed1);
        System.out.println("breaks: "+brk1);
    }
}

public class interfacecar {
    public static void main(String[] args) {
        car c=new car();
        c.gearchange(5);
        c.speedincrease(40);
        c.breaks(4);
        c.print();

        bike b=new bike();
        b.gearchange(6);
        b.speedincrease(50);
        b.breaks(5);
        b.print();
    }
}
