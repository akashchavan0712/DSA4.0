package patternPractice;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : \t");
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i ;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
