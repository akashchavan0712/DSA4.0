package patternPractice;
import java.util.Scanner;

public class hollowpattern1 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the Pattern :  ");
        int n = sc.nextInt();
        sc.close();

        int nst1 = (n/2)+1;
        int nsp = 1;
        int nst2 = (n/2)+1;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= nst1; j++) 
            {
                System.out.print("*");
            }
            for (int k = 1; k <= nsp; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= nst2; l++) 
            {
                System.out.print("*");
            }
            System.out.println();

            if(i <= nst1)
            {
                nst1-=1;
                nst2-=1;
                nsp= nsp + 2;
            }
            else
            {
                nst1+=1;
                nst2+=1;
                nsp = nsp -2;
            }
        }
    }
}
