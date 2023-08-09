package arrays;

import java.util.Scanner;

public class differenceOfTwoArrays1 {

    public static int[] differenceOfTwoArrays(int arr1[], int arr2[], int m, int n)
    {
        int maxSize = m > n ? m : n;
        int arr3[] = new int[maxSize];
        int i = m-1;
        int j = n-1;
        int k = maxSize - 1;
        int difference = 0;
        int borrow = 0;
        int num1 = 0, num2 = 0;
        while(i >= 0 && j >= 0 && borrow >= 0)
        {
            if(i >= 0)
            {
                num1 = arr1[i];
            }
            if(j >= 0)
            {
                num2 = arr2[j];
            }
            if(num2 > num1)
            {
                difference = (num1 + 10) - borrow - num2;
                borrow = 1;
            }
            else{
                difference = (num1 - borrow) - num2;
                borrow = 0;
            }
            arr3[k] = difference;
            k--;
            j--;
            i--;
        }
        if(borrow != 0 || num1 > 0)
        {
            arr3[k] = num1 - borrow;
        }
        return arr3;
    }
    public static void main(String[] args) {
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

        int arr3[] = differenceOfTwoArrays(arr1,arr2,m,n);

        for (int i = 0; i < arr3.length; i++) {
            // if(i == 0 && arr3[i] == 0)
            // {
            //     continue;
            // }
            System.out.print(arr3[i]);
        }

        sc.close();
    }
}
