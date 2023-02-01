package arrays;
import java.util.Scanner;

public class sumOfTwoArrays {

    public static void addingArrays(int arr1[], int arr2[], int n1, int n2)
    {
        //Finding the larger array size
        int max = 0;
        if(n1 > n2)
        {
            max = n1;
        }
        else{
            max = n2;
        }

        //Creating Solution Array for storing addition of two numebrs
        int arr3[] = new int[max+1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = arr3.length -1;
        int sum = 0;
        int carry = 0;
        
        //Now Performing the additions
        while(i >= 0 || j >= 0)
        {
            int add = 0;
            if(i >= 0)
            {
                add += arr1[i];
            }
            if(j >= 0)
            {
                add += arr2[j];
            }

            sum = add % 10;
            carry = add / 10;
            arr3[k] = sum;

            i--;
            j--;
            k--;
        }

        if(carry > 0)
        {
            System.out.print(carry);
        }

        //Printing The Third Array
        for(int x = 0; x < arr3.length; x++)
        {
            if(x == 0 && arr3[x] == 0)
            {
                continue;
            }
            System.out.print(arr3[x]);
        }

    }

    public static void main(String[] args) {

        //Taking Inputs the array sizes of two arrays
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter The Size Of The Array1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter The Size Of The Array2 : ");
        int n2 = sc.nextInt();

        //Creating Arrays of the given length
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        //Taking Actual Inputs in Array1
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        //Taking Actual Inputs in Array2
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        //Calling the addition function
        addingArrays(arr1, arr2, n1, n2);
        sc.close();


    }
}
