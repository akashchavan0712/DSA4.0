package arrays;

import java.util.Scanner;

public class barChart2 {

    //Taking input of array size and array elements
    public static int[] getArrayElements()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length of the array : ");
        
        //Creating the array of the required length
        int length = sc.nextInt();
        int arr[] = new int[length];

        //Taking the input elemets
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    public static void main(String[] args) 
    {
        int arr[] = getArrayElements();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i])
            {
                max = arr[i];
            }
        }

        //Now since we have max element
        //Lets go define loop for columns now
        int temp = max;
        for (int i = 0; i < max; i++) {
            //Now reverse printing the stars and spaces
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= temp) {
                    System.out.print("***\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            temp--;
        }
    }
}
