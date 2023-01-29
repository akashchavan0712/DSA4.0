package patternPractice;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : \t");
        int a = sc.nextInt();
        sc.close();

        for (int i = 0; i < a; i++){ 
            for (int j = a; j > i ; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k <= i ; k++) 
            {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
