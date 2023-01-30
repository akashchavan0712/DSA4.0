package arrays;
import java.util.Scanner;

public class spanOfArray {

    public static int spanOfInput(int arr[], int n)
    {
        //Initializing Smallest and Largest Values to first Element in array

        int maxElement = arr[0];
        int minElement = arr[0];

        for (int j = 0; j < n; j++) {
            if(arr[j] > maxElement)
            {
                maxElement = arr[j];
            }    
            if(arr[j] < minElement)
            {
                minElement = arr[j];
            }
        }
        System.out.println("Smallest Numebr is : "+minElement);
        System.out.println("Largest Number is : "+maxElement);
        return (maxElement - minElement);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total numbers present : ");
        int n = sc.nextInt();

        //Creating Array of Required Size
        int arr[] = new int[n];

        //Taking n inputs
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        //Calling The Function
        System.out.println(spanOfInput(arr, n));
    }
}
