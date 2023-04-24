//wap a genric class that finds largest of 2 variable
import java.util.*;
class stats<t extends Number>{
    t[] nums;
    stats(t[] o ){
        nums=o;
    }
    double average(){
        double sum=0.0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    boolean sameAvg(stats<?> ob){
        if(average()==ob.average()){
            return true;
        }
        return false;
    }

}

public class genericpro3 {
    public static void main(String[] args) {
        Integer innums[]={1,2,3,5};
        stats<Integer> obj1= new stats<Integer>(innums);
        System.out.println(obj1.average());

        double nm[]={1.0,2.0,3.5,4.5};
        stats<Double> obj2= new stats<Double>(nm);
        System.out.println(obj2.average());
        System.out.println(obj1.sameAvg(obj2));
    }
}
