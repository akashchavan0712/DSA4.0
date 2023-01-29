package functions;
import java.util.Scanner;

public class anyBaseSubtraction {

    public static int anySubtractor(int num1 , int num2 , int base)
    {

        int result = 0;
        int power = 1;
        int difference = 0;
        int borrow= 0;

        // Creating a new sum variable

        while( num1 != 0 || num2 != 0 )
        {

            int d1 = num1 % 10;
            int d2 = num2 % 10;

            num1 /= 10;
            num2 /= 10;

            if(d1 >= d2){
                difference = (d1 - borrow) - d2;
                borrow = 0;
            }
            else{
                difference = (((d1-borrow) + base ) - d2);
                borrow = 1;
            }

            result = result + (power * difference);
            power = power * 10;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter The Base Of The Number : ");
        int base = sc.nextInt();

        int x = anySubtractor(num1, num2, base);

        System.out.println("The Final Value of Subtraction is : "+x);
        sc.close();
    }
}
