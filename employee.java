import java.util.*;

public class employee {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int arr[][]=new int[row][2];
        if(row>=1 & row<=10){
            for(int i=0;i<row;i++){
                for(int j=0;j<2;j++){

                    int l = input.nextInt();
                    if(j==0){
                        if(l<=100 & l>=1){  // 10 <= id <= 1000 ;
                            arr[i][j]=l;
                        }
                        else{
                            System.out.println("Invalid data");
                        }
                    }
                    if(j==1){
                        if(l<=50 & l>=18){  //  18 <= age <= 50
                            arr[i][j]=l;
                        }
                        else{
                            System.out.println("Invalid data");
                        }
                    }
                }
            }
            for(int k=0;k<row;k++){
                if(arr[k][1]<30){
                    System.out.println(arr[k][1]);
                }
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
