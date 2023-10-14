import java.util.*;

public class sum_of_num {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N : ");
        int N = scan.nextInt();

        int sum = 0;
        for(int i = 1;i <= N;i++) {
            sum = sum + i;
        }

        System.out.println("Sum : " + sum);


    }
}
