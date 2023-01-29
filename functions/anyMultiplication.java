package functions;
import java.util.Scanner;
//Let's Divide the multiplication procedure base on its functions
//Step 1: Extracting the last digits of both numbers and multiplying them with each other
//Step 2: Getting Addition of the numbers generated
//Step 3: Merging the result of additions

public class anyMultiplication {

    public static int anyBaseaddition(int num1, int num2, int base){
        
        //Addition
        int carry = 0;
        int addition = 0;
        int power = 1;
        int result = 0;
        while(num1 > 0 || num2 > 0 || carry > 0)
        {
            //extracting digits from number
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            //Reducting the extracting numbers
            num1 /= 10;
            num2 /= 10;

            addition = d1 + d2 + carry;
            
            int rem = addition % base;
            int quo = addition / base;
            carry = quo;

            result = result + (rem * power);
            power = power * 10;
        }
        return result;
    }

    public static int singleDigitWithNumber(int num1, int d2, int base)
    {
        int multiplication = 0;
        int carry = 0;
        int result1 = 0;
        int power = 1;
        while(num1 > 0)
        {
            //Extracting digits form the num1
            int d1 = num1 % 10;

            //Reducting the number
            num1 /= 10;

            //Multiplications 
            multiplication = (d1 * d2) + carry;

            int rem = multiplication % base;
            int quo = multiplication / base;

            carry = quo;
            result1 = result1 + (rem * power);
            power = power * 10;
        }
        return result1;
    }

    public static int anyMultiplier(int num1, int num2, int base)
    {
        int result = 0;
        int addZero = 1;
        while(num2 > 0)
        {
            //Step 1: Extracting The Final Digit from Num2
            int d2 = num2 % 10;
            num2 = num2 / 10;
            //Multiplying num1 with d2
            int partialMultiplication = singleDigitWithNumber(num1, d2, base);
            partialMultiplication = partialMultiplication * addZero;
            result = anyBaseaddition(partialMultiplication, result, base);
            addZero = addZero * 10;
        }
        
        //returning the final result;
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
