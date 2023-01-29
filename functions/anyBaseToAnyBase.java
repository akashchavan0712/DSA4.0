package functions;
import java.util.Scanner;

public class anyBaseToAnyBase{

    public static int anyToDecimal(int num , int base1 , int base2)
    {
        int result = 0;
        int power = 1;
        while(num > 0)
        {
            int digit = num % 10;
            num = num / 10;
            result = result + (digit * power);
            power = power * base1;
        }
        int x = decimalToAny(result, base2);
        return x;
    }

    public static int decimalToAny(int num, int base)
    {
        int result = 0;
        int power = 1;
        while(num > 0){
            int digit = num % base;
            num = num / base;
            result = result + (digit * power); 
            power = power * base;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        // Input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Be Converted : ");
        int num = sc.nextInt();
        System.out.println("Enter The Base of the number : ");
        int base1 = sc.nextInt();
        System.out.println("In Which Base Do You Wish To Convert : ");
        int base2 = sc.nextInt();
        int result = anyToDecimal(num , base1 , base2);
        System.out.println("The Converted Number is : "+result);
        sc.close();
    }
}
