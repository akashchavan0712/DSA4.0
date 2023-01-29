package patternPractice;
import java.util.Scanner;

public class binomialTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of The Stars : \t");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) 
        {
            int value = 1;
            for (int j = 0; j <= i; j++) 
            {
                int k = (i - j);
                System.out.print(value+"\t");
                value = ( (value * k) / (j+1));
            }
            System.out.println();
        }
    }
}
