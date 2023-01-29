package functions;
import java.util.*;

public class swapWithoutTemp {

    public static void withoutTempSwap(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = : "+a);
        System.out.println("b = : "+b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking Inputs
        System.out.println("Please enter the number1 : ");
        int x = sc.nextInt();
        System.out.println("Please Enter The number2 : ");
        int y = sc.nextInt();
        sc.close();
        
        withoutTempSwap(x, y);
    }
}
