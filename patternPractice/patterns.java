package patternPractice;
import java.util.Scanner;

public class patterns {

    // Pyramid Between The Two Stars

    public static void pyramidPattern1(int n){
        for(int i = 0; i < n; i++) 
        {
            for (int k = n; k >= i ; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pyramid One The Rest of The Stars

    public static void pyramidPattern2(int n) {
        int stars = 1;
        int spaces = (n/2);
        for (int i = 1; i <= (n/2)+1 ; i++) 
        {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            spaces-=1;
            stars+=2;
            System.out.println();
        }

    }

    public static void rightAngledTriangle(int n){
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }   
            System.out.println();
        }
    }

    public static void rightAngledTriangleRight(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        int stars = 1;
        int spaces = (n/2);
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            if (i <= n/2)
            {
                stars+=2;
                spaces-=1;
            }
            else{
                spaces+=1;
                stars-=2;
            }
            System.out.println();
        }
    }

    // Downward Right-Angled Triangle

    public static void downwardRightAngledTriangle(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(int n){
        int stars = n;
        int space = 0;
        for (int i = 1; i <= (n/2)+1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars ; j++) {
                System.out.print("* ");
            }
            space+=1;
            stars-=2;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag)
        {
            System.out.println("Press 1: Pyramid-Type 1");
            System.out.println("Press 2: Pyramid-Type 2");
            System.out.println("Press 3: Right Angled Triangle to Left");
            System.out.println("Press 4: Right Angled Triangle to Right");
            System.out.println("Press 5: Diamond(Odd)");
            System.out.println("Press 6: Downward Right Angled Traingle");
            System.out.println("Press 7: Inverted Triangle");

            System.out.println("Enter The Option You Choose");
            int option = sc.nextInt();
            System.out.println("Enter The Max Length of Stars :  ");
            int n = sc.nextInt();
            
            switch (option) 
            {
                case 1:
                    System.out.println("\n\nPyramid Type 1\n");
                    pyramidPattern1(n);
                    break;
                case 2:
                    System.out.println("Pyramid Type 2\n");
                    pyramidPattern2(n);
                    break;
                case 3:
                    System.out.println("Right-Angled Triangle\n");
                    rightAngledTriangle(n);
                    break;
                case 4:
                    System.out.println("Right-Angled Triangle to Right\n");
                    rightAngledTriangleRight(n);
                    break;
                case 5:
                    System.out.println("Diamond\n");
                    diamond(n);
                    break;
                case 6:
                    System.out.println("Downward Right Angled Triangle\n");
                    downwardRightAngledTriangle(n);
                    break;
                case 7:
                    System.out.println("Inverted Triangle\n");
                    invertedTriangle(n);
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Sorry , Please Enter One of the above numbers.");
            }
        }
    sc.close();
    }
}
