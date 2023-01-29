package functions;
import java.util.Scanner;

public class digitCount{

    public static int digitCounter(int n, int key)
    {
        int count = 0;
        while( n != 0){
            int rem = n % 10;
            if(rem == key){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the number you want to search : ");
        int key = sc.nextInt();
        sc.close();
        int a = digitCounter(n,key);
        System.out.println(a);

    }
}
