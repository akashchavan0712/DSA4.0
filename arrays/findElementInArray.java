package arrays;
import java.util.Scanner;
import java.util.*;

public class findElementInArray {

    public static boolean elementSearchLinear(int arr[], int n, int k)
    {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(arr[i] == k)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean elementSearchBinary(int arr[], int n, int k)
    {
        Arrays.sort(arr);
        boolean flag = false;

        //lets define starting and ending variable
        int left = 0;
        int right = n;
        
        while(left <= right)
        {
            //calculating the middle element
            int middle = left + (right - 1) / 2;

            if(k == arr[middle])
            {
                flag = true;
            }
            else if(k < arr[middle])
            {
                right = middle-1;
            }
            else{
                left = middle+1;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements : ");
        int n = sc.nextInt();

        //Creating array of n size
        int arr[] = new int[n];

        //Taking Inputs in array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        System.out.println(elementSearchBinary(arr, n, key));
        System.out.println(elementSearchLinear(arr, n, key));
        sc.close();
    }
}
