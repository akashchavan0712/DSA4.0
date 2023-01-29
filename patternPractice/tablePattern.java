package patternPractice;
import java.util.Scanner;

public class tablePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Table : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(n+ " * "+i);
        }

    }
}