package patternPractice;
import java.util.Scanner;

public class patternW {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Length of the stars : \t");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                System.out.println("Anything");
            }
            System.out.println();
        }

    }
}
