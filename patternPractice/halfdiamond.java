package patternPractice;
import java.util.Scanner;

public class halfdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length of the pattern : \t");
        int a = sc.nextInt();
        sc.close();
        int star = a/2;

        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }   
            System.out.println();

            if(i > star){
                star-=1;
            }
        }
    }
}
