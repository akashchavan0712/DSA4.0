package patternPractice;
import java.util.Scanner;

public class digitDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : ");
        int n = sc.nextInt();
        sc.close();


        int stars = 1;
        int space = n/2;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            int count = i;
            if(i <= n/2)
            {
                count = i;
            }
            else{
                count = (n+1)-i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(count+"\t");
                if(j <= (stars/2))
                {
                    count=count+1;
                }
                else{
                    count=count-1;
                }
            }
            System.out.println();
            if(i <= n/2)
            {
                space = space - 1;
                stars = stars + 2;
            }
            else{
                space = space + 1;
                stars = stars -2;
            }
        }
    }
}
