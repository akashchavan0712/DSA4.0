package patternPractice;
import java.util.Scanner;

public class arrowStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of The arrow");
        int n = sc.nextInt();
        sc.close();

        int space = (n/2);
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                if(i == n/2+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= stars; j++) 
            {
                System.out.print("* ");
            }
            if (i <= n/2)
            {
                stars++;
            }
            else{
                stars--;
            }
            System.out.println();
        }
    }
}
