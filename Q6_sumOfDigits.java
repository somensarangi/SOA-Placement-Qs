package SET1;
/*
Write a java program to find sum of digit of a given number until it becomes a single
digit number.
 */
import java.util.*;
public class Q6_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits of "+num+" ,until it becomes a single digit : "+loop(num));
    }
    static int loop(int num){
        int temp = num;
        while(temp/10 != 0){
            temp = sum_of_digits(temp);
        }
        return temp;
    }

    static int sum_of_digits(int temp) {
        int sum = 0;
        while(temp != 0){
            sum += temp%10;
            temp /= 10;
        }
        return sum;
    }
}
