package SET1;

//Write a java program to divide a number by 4 without using / operator.

import java.util.*;
public class Q2_Divide_a_num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int divisor = 4;
        System.out.println("Result of division by 4 without using / operator is:  "+Divide(num, divisor));
    }
    static int Divide(int num, int divisor){
        if(num == 0){
            return 0;
        }
        boolean negativeResult = false;
        if(num < 0){
            num = -num;
            if(divisor < 0){
                divisor = -divisor;
            }
            else{
                negativeResult = true;
            }
        }
        else if(divisor < 0){
            divisor = - divisor;
            negativeResult = true;
        }
        int q = 0;
        while (num >= divisor){
            num -= divisor;
            q++;
        }
        if(negativeResult)
            q = -q;
        return q;
    }
}
