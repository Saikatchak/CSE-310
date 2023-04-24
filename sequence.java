
import java.util.*;

public class sequence {

    private static boolean have4(long n) {
        while (n > 0) {

            if (n % 10 == 4) {

                return true;
                
            }
            n=n/10;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = input.nextInt();

        while (times-- > 0) {
            long num = input.nextLong();
            long c = 0;
            for (long i = 1; ; i++) {
                if (!have4(i)) {
                    c++;
                }
                if (c == num) {
                    System.out.println(i);
                    break;
                }
            }
        }
        input.close();
    }
}
