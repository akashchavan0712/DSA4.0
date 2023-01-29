package functions;
import java.util.Scanner;

public class decimalToAny{

    public static int decimalToAnyNum(int num , int base)
    {
        int result = 0;
        int power = 1;
        while(num > 0){
            int rem = num % base;
            num = num / base;
            result += (rem * power);
            power *= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Number : ");
        int number = sc.nextInt();
        System.out.println("Enter The Base of Conversion : ");
        int base = sc.nextInt();
        int ans = decimalToAnyNum(number , base);
        System.out.println("The Number converted is\t"+ans);
        sc.close();
    }
}
