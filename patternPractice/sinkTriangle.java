package patternPractice;
import java.util.Scanner;

public class sinkTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of The pattern : ");
        int n = sc.nextInt();
        sc.close();
        int stars_s = 1;
        int space = (2 * n - 3);
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= stars_s; j++)
            {
                System.out.print(count+" ");
                count++;
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            count = i;
            if(i == n)
            {
                count = i-1;
                stars_s = stars_s -1;
            }
            for (int j = 1; j <= stars_s; j++) {
                System.out.print(count+" ");
                count--;
            }
            stars_s+=1;
            space-=2;
            System.out.println();
        }
    }
}
