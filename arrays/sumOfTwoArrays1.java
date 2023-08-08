package arrays;

import java.util.Scanner;

public class sumOfTwoArrays1 {

    public static int[] arrayAddition(int arr1[], int arr2[], int m, int n)
    {
        //Creating array of size maxSize+1 
        int maxSize = m > n ? m : n;
        int arr3[] = new int[maxSize+1];

        //Declaring the necessary variables
        int i = m-1;
        int j = n-1;
        int k = maxSize; 
        int sum = 0;
        int carry = 0;
        int rem = 0;
        
        //Iterating and creating new array
        while(k >= 0)
        {
            sum = carry;

            if(i >= 0)
            {
                sum = sum + arr1[i];
            }
            if(j >= 0)
            {
                sum = sum + arr2[j];
            }

            //Getting Carry and Remainder
            carry = sum / 10;
            rem = sum % 10;

            //Adding to addition array
            arr3[k] = rem;

            i--;
            j--;
            k--;
        }

        if(carry > 0)
        {
            arr3[k] = carry;
        }

        return arr3;
    } 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the size of the array1 : ");
        int m = sc.nextInt();

        System.out.print("Please enter the size of the array2 : ");
        int n = sc.nextInt();

        //Creating two arrays of size m and n;
        int arr1[] = new int[m];
        int arr2[] = new int[n];

        System.out.println("Enter the "+m+" elements for the array1 : ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the "+n+" elements for the array2 : ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr3[] = arrayAddition(arr1,arr2,m,n);

        for (int i = 0; i < arr3.length; i++) {
            if(i == 0 && arr3[i] == 0)
            {
                continue;
            }
            System.out.print(arr3[i]);
        }

        sc.close();

    }
}
