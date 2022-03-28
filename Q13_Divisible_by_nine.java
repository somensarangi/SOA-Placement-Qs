package SET1;
/*
An integer n is divisible by 9 if the sum of its digits is divisible by 9. Develop a
program to display each digit, starting with the rightmost digit. Your program should also
determine whether or not the number is divisible by 9. Test it on the following numbers:
(d) n = 154368
(e) n = 621594
(f) n = 123456
 */
import java.util.*;
public class Q13_Divisible_by_nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        digitsDivisibleByNine(num);
    }
    static void digitsDivisibleByNine(int num){
        int a;
        int sum = 0;
        while(num>0){
            a = num%10;
            System.out.print(a);
            sum += a;
            num /= 10;
        }
        System.out.println();
        if(sum % 9 == 0){
            System.out.println("Number is divisible by 9");
        }else{
            System.out.println("Number is not divisible by 9");
        }
    }
}
