interface fact{
    boolean factor(int a,int b);
}
public class lambda1 {
    public static void main(String[] args) {
        fact f1;
        f1=(x,y)->{
            if(x%y==0){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println("the number 2 is factor of n1= "+f1.factor(6, 2));
    }
}
