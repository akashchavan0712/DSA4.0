package patternPractice;
import java.util.Scanner;

public class reverseNumber
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number");
        int inp = sc.nextInt();
        sc.close();
        int x;
        while(inp > 0)
        {
            x = inp % 10;
            System.out.print(x);
            inp = inp / 10;
        }
    }
}
