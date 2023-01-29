package functions;

import java.util.Scanner;

public class factorial {

    // Function to Calculate the factorial of the desired numbers
    public static int find_factorial(int num){
        int result = 1;
        for (int i = num; i >= 1; i--) 
        {
            result = result * i;
        }
        return result;
    }

    // Function to find the nCr of the given number
    public static int nCr(int n, int r){
        int n_ = find_factorial(n);
        int r_ = find_factorial(r);
        int nr = find_factorial(n-r);
        int nCr = n_ / ((nr) * r_);
        return nCr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter The Value of r : ");
        int r = sc.nextInt();
        sc.close();
        int b = nCr(n,r);
        System.out.println("The "+n+"C"+r+" value is : "+b);
    }
}
