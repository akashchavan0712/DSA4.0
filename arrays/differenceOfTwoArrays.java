package arrays;
import java.util.Scanner;

public class differenceOfTwoArrays {

    public static int differenceCalculator(int arr1[], int arr2[], int n1, int n2)
    {
        int i = n1-1;
        int j = n2-1;
        //int result = 0;
        int difference = 0;
        int borrow = 0;
        while(i > 0 || j > 0)
        {
            if (arr1[i] - borrow <= arr2[j] ) 
            {
                difference = (arr2[j] - borrow) - arr1[i];
                borrow = 0;
            } 
            else 
            {
                difference = ((arr2[j] + 10) - borrow) - arr1[i];
                borrow = 1;
            }
            System.out.println(difference);
            i--;
            j--;
        }
        return 0;
    }
    public static void main(String[] args) {

        //Taking n1,n2,array1,array2 as input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1/number1");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of the array2/number2");
        int n2 = sc.nextInt();

        //Declaring the arrays
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
 
        //Taking array1 inputs
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        //Taking array2 inputs
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        //Calling The Function
        int diff = differenceCalculator(arr1, arr2, n1, n2);
        System.out.println("Difference Between Two Numbers is : "+diff);
        sc.close();
    }
}
