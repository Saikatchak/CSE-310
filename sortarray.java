import java.util.*;
public class sortarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int number;
        int i;
        int j;
        int temp;
        int arr[] = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of an array");
        number = sc.nextInt();
        for(i = 0; i <(number - 1); i++)
        {
            arr[i] = sc.nextInt();
            for(j = 0; i < (number - 1 ); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                        else
                        {
                            System.out.println("Invalid");
                        }
                
            }
        }
                        
    }
}
