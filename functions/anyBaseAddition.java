package functions;
import java.util.Scanner;

public class anyBaseAddition {

    public static int anyBaseAdder(int num1, int num2, int base){
        int result = 0;
        int power = 1;
        int carry = 0;
        while(num1 != 0 || num2 != 0 || carry !=0)
        {
            int n1 = num1 % 10;
            int n2 = num2 % 10;

            num1/= 10;
            num2/= 10;

            int sum = n1 + n2 + carry;
            int rem = sum % base;
            int quo = sum / base;

            result += (rem * power);
            carry = quo;
            power*=10;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter The Base of the numbers to be added : ");
        int base = sc.nextInt();
        sc.close();

        int result = anyBaseAdder(num1 , num2, base);
        System.out.println("Addition of the two numbers is : "+result);

    }
}
