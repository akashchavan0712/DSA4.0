package functions;
import java.util.Scanner;

public class anyToDecimal{

    public static int converter(int num , int base){
        int result = 0;
        int power = 1;
        while(num > 0){
            int value = num % 10;
            num /= 10;
            result += value * power;
            power *=  base;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To be Converted : ");
        int number = sc.nextInt();
        System.out.println("Enter The Base of The Given Number : ");
        int base = sc.nextInt();
        int result = converter(number , base);
        System.out.println("The Given Number in decimal is :  "+result);
        sc.close();
    }
}