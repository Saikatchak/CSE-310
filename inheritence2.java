import java.util.*;

class university{
    int regno;
    university(){
        Scanner inp=new Scanner(System.in);
        System.out.println("enter regno:");
        regno=inp.nextInt();
    }
    void print(){
        print();
        System.out.println(regno);
    }
}
class details extends university{
    String name;
    char grade;
    details(int a,String b,char c){
        name=b;
        grade=c;
        regno=a;
    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("regno:"+regno);
        System.out.println("grade:"+grade);
    }
}
class inheritence2 {
    public static void main(String[] args) {
        details obj2=new details(1,"abc",'m');
        obj2.print();
    }
}
