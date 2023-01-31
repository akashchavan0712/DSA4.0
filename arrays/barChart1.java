package arrays;
import java.util.Scanner;

public class barChart1 {

    public static void printBarChart(int arr[], int n)
    {
        /*
            Step 1: Finding The MAX element in an array so that we can identify the peak point of bar
            Since we start printing from top to bottom we need top position
        */
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        /*
         * Step 2 : Since the maximum element is known we can subtract it from current array size
         * If the max-current_size >= i print *, else don't
         */
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < n; j++) {
                if(max - arr[j] <= i)
                {
                    System.out.print("****\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input size of the user
        System.out.println("Enter The Size of the array : ");
        int n = sc.nextInt();

        //Array Inputs
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Calling the function
        printBarChart(arr, n);
        sc.close();
    }
}
