package arrays;
import java.util.Scanner;

public class barChart {

    public static void printBarChart(int arr[], int n)
    {
        //Lets First Find Largest Element Among the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        
        //Printing The stars and Spaces
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
        System.out.println("Enter total number of elements in an array");
        int n = sc.nextInt();

        //creating array of given size
        int arr[] = new int[n];

        //Inputs
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //Calling The BarChartPrintFunction
        printBarChart(arr, n);

        //close the scanner
        sc.close();
    }
}
