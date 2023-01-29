package patternPractice;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : \t");
        int a = sc.nextInt();
        sc.close();
        System.out.println();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
