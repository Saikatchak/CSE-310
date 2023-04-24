import java.util.*;

class department{
    String deptname;
    String HODname;

    department(String a,String b){
        this.deptname=a;
        this.HODname=b;
    }

    void deptdetails(){
        System.out.println(deptname);
        System.out.println(HODname);
    }

}
class staffname extends department{
    staffname(){}
}
public class departmentandstaff {
    
}
