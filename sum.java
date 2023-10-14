import java.util.*;

public class sum {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N : ");
        int N = scan.nextInt();

        int sum = (N*(N+1))/2;

        System.out.println("Sum : " + sum);

    }
}
