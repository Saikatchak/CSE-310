import java.util.*;
public class celciustofarenite {
    public static void main(String[] args) {
        double temp;
        Scanner input=new Scanner(System.in);
        int choice;
        choice=input.nextInt();
        if(choice==1){
            temp=input.nextDouble();
            Double restemp=((temp-32)*5/9); //°C = (°F − 32) x 5/9
            System.out.printf("%.2f",restemp);
        }
        else if(choice==2){
            temp=input.nextDouble();
            Double restemp=((temp*(9/5))+32);   //°F = (°C × 9/5) + 32
            System.out.printf("%.1f",restemp);
        }
        else{
            System.out.println("INVALID CHOICE");
        }
        

    }
}
