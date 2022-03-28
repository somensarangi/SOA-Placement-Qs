package SET1;

/* Write a java program to find greatest between two numbers without using if-else and
conditional operator. (in-built method should not be used) */

import java.util.*;
public class Q1_Greatest_bw_2_nos
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Greatest no is: "+checkingNumber(a,b));
    }
    public static int checkingNumber(int a, int b){
        int temp = a*(a/b > 0 ? 1:0 ) + b*(b/a > 0 ? 1 : 0);
        return temp;
    }
}
