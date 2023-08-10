package arrays;

import java.util.Scanner;

public class reverseTheArray {

    public static void returnReverseTheArray(int arr[])
    {
        int i = 0;
        int j = arr.length - 1;

        //Looping for reversing the array
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //Printing the array
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println(arr[j2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total size of the array : ");
        int n = sc.nextInt();
        int arr[] =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        returnReverseTheArray(arr);
    }
}
