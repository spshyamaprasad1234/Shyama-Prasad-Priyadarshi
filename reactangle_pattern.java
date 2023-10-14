import java.util.*;

public class reactangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();

        for(int i = 0;i < N;i++) {
            for(int j = 1;j <= N;j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }    
}
