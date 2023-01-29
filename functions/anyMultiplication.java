package functions;
import java.util.Scanner;

public class anyMultiplication {

    public static int anyMultiplier(int num1, int num2, int base){

        int result = 0;
        int addZero = 1;
        while(num2 != 0){

            int d1 = num2 % 10;
            num2 /= 10;

            int partialAddition = getProductWithSingleDigit(num1 ,d1 ,base);
            partialAddition = partialAddition * addZero;
            result = anyBaseAddition(partialAddition, result, base);
            addZero *= 10;
        }

        return result;
    }

    public static int anyBaseAddition(int num1, int num2, int base){

        int addition = 0;
        int carry = 0;
        int power = 1;

        while(num1 != 0 || num2 != 0 || carry != 0)
        {
            // Separate The Last Digits and Reduce the Numbers

            int n1 = num1 % 10;
            int n2 = num2 % 10;

            num1 /= 10;
            num2 /= 10;

            // Creating a Sum Variable

            int sum = n1 + n2 + carry;

            int rem = sum % base;
            int quo = sum / base;

            carry = quo;
            addition += (rem * power);
            power *= 10;
        }
        return addition;
    }

    public static int getProductWithSingleDigit(int num1, int d2, int base){

        int result = 0;
        int carry = 0;
        int product = 0;
        int power = 1;

        while(num1 != 0 || carry != 0){

            // Getting Last digit and Reducing the number

            int n1 = num1 % 10;
            num1 /= 10;

            product = (n1 * d2) + carry;

            int rem = product % base;
            int quo = product / base;

            carry = quo;
            result = result + (rem * power);
            power = power * 10;

        }
        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Number2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter The Base of The Numbers : ");
        int base = sc.nextInt();
        sc.close();
        int x = anyMultiplier(num1 ,num2, base);
        System.out.println("The Multiplication of given two numbers is : "+x);
    }
}
