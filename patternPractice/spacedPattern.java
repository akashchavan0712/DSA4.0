package patternPractice;
import java.util.Scanner;

public class spacedPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the Pattern :  ");
        int nsp = 0;
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
            nsp++;
        }
    }
}
