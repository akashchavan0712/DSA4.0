package patternPractice;
import java.util.Scanner;

public class fibonacciTriangle {
    public static void main(String[] args) {

        int prev1 = 0;
        int prev2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : \t");
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
            {
                int result = prev1+prev2;
                System.out.print(prev1+" ");
                prev1 = prev2;
                prev2 = result;
            }
            System.out.println();
        }
        System.out.println();
    }
}
