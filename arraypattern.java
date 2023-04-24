import java.util.*;
public class arraypattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("==============<<SELECT>>=============\n 1: FOR TRAIN \n 2: FOR BUS \n 3: FOR AIRPORT \n=====================================");

    }
}
