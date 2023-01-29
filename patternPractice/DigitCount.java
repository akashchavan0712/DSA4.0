package patternPractice;
import java.util.Scanner;

public class DigitCount{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number");
        int a = sc.nextInt();
        int count = 1;
        sc.close();

        while(a/10 != 0)
        {
            count++;
            a = a/10;
        }

        System.out.println(count);

    }
}