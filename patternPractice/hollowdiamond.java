package patternPractice;
import java.util.Scanner;

public class hollowdiamond 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length of the pattern : ");
        int n = sc.nextInt();
        sc.close();

        int nsp1 = (n/2);
        int nsp2 = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (nsp1); j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= (nsp2); j++) {
                System.out.print("  ");
            }
            if (i != 1 && i != n)
            {
                System.out.print("* ");
            }
            System.out.println();
            if (i <= n/2){
                nsp1 = nsp1 - 1;
                nsp2 = nsp2 + 2;
            }
            else{
                nsp1 = nsp1 + 1;
                nsp2 = nsp2 - 2;
            }
        }
    }
}
