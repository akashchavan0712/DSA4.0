 package arrays;
import java.util.Scanner;

public class differenceOfTwoArrays {

    public static int[] differenceCalculator(int arr1[], int arr2[], int n1, int n2)
    {

        //Starting from last digit
        int i = n1-1;
        int j = n2-1;

        //Storing the difference in the array 
        int diff[] = new int[n2];
        int k = diff.length-1;
        int borrow = 0;
        
        //Subtracting and Adding it to difference array
        int i2 = 0;
        while(k >= 0)
        {
            int difference = 0;
            //Since array one is smaller
            //Index should be updated to 0
            //Else it will cause array out of bound of exception
            if(i >= 0)
            {
                i2 = arr1[i];
            }
            else{
                i2 = 0;
            }

            //Subtraction
            if(arr2[j] - borrow >= i2)
            {
                difference = arr2[j] - i2;
                borrow = 0;
            }
            else
            {
                difference = arr2[j] + 10 - borrow;
                borrow = 1;
            }

            diff[k] = difference;
            i--;
            j--;
            k--;
        }
        return diff;
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
        int diff[] = differenceCalculator(arr1, arr2, n1, n2);
        for (int i = 0; i < diff.length; i++) {
            System.out.print("--->"+diff[i]);
        }
        sc.close();
    }
}
