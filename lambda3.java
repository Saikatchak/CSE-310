
interface fact{
    boolean test(Student t);
}
class Student{
    String name;
    int rollno;
    String department;
}
public class lambda3 {
    public static void main(String[] args) {
        fact f1;
        f1=(t)->{
            if(){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println("the number 2 is factor of n1= "+f1.factor(6, 2));
    }
}
