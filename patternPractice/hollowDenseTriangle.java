package patternPractice;
import java.util.Scanner;

public class hollowDenseTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the Triangle");
        int n = sc.nextInt();
        sc.close();

        int ispace = n-2;
        int ospace = 0;
        int stars = n-1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= ospace ; j++) 
            {
                System.out.print("  ");
            }

            System.out.print("* ");

            for (int j = 1; j < n-1; j++) {
                if (i == 1){
                    System.out.print("* ");
                }
            }

            for (int j = 1; j <= ispace; j++) {
                if (i != 1){
                    System.out.print("  ");
                }
            }
            
            if (i > n/2)
            {
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
            }
            if(i <= n/2)
            {
                stars-=2;
                ospace+=1;
                ispace-=2;
            }
            else{
                stars+=2;
                ospace-=1;
            }

            System.out.println();
        }
    }
}
