package patternPractice;
import java.util.Scanner;

public class numericalPattern {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The Length of the Pattern\t : ");
        int a = sc.nextInt();
        int count = 1;
        sc.close();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
