package patternPractice;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : \t");
        int a = sc.nextInt();
        sc.close();

        for (int i = a; i >= 1; i--) {
            for (int j = i; j >= 1 ;j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
