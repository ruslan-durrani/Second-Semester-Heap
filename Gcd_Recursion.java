package Ruslan_7kd;
import java.util.*;
public class Gcd_Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**** GCD ****");
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf("The GCD for %d and %d is : %d",a,b,gcd(a,b));
    }
    //Recursive Method
    private static int gcd(int m, int n) {
        // Base case
        if (m % n == 0) return n;
        // Recursive call
        else return gcd(n, m % n);
    }
}




//        int c = 1;
//        if(a>b)
//            c = b;
//        else
//            c = a;
//        System.out.println(GCD(a,b,c));
//public static int GCD(int a , int b , int x ){
//    if(a%b==0) return b;
//    else if (x == 0) return 1;
//    else if((a%x==0) && (b%x==0) )return x;
//    else return GCD(a,b,x-1);
//}