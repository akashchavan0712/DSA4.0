package patternPractice;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : \t");
        int a = sc.nextInt();
        sc.close();

        int nst = 1;
        int nsp = a/2;

        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= nsp ; j++) 
            {
                System.out.print("  ");
            }
            for (int k = 1 ; k <= nst ; k++) 
            {
                System.out.print("* ");   
            }

            if(i <= a/2)
            {
                nst+=2;
                nsp-=1;
            }
            else{
                nst-=2;
                nsp+=1;
            }

            System.out.println();
        }
    }
}
