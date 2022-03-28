package SET1;
/*
Write a java program to check whether two given number ‘a’ and ‘b’ are consecutive
term in the Fibonacci series or not.
 */
import java.util.*;
public class Q4_checking_fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("____________________________________________________________");
        System.out.println(isFibonacci(a) ? a +" is a fibonacci number" : a +" is't a fibonacci number");
        System.out.println(isFibonacci(b) ? b +" is a fibonacci number" : b +" is't a fibonacci number");
        System.out.println("____________________________________________________________");
        int result = consecutiveFibonacci(a, b);
        switch (result) {
            case 0:
                System.out.println("They are not consecutive Fibonacci numbers.");
                break;
            case 1:
                System.out.println("They are consecutive Fibonacci numbers");
                break;
            default:
                System.out.println("ERROR in code");
                break;
        }
    }

    static boolean isPerfectSquare(int num){
        int sq = (int)Math.sqrt(num);
        return ((int)Math.pow(sq, 2) == num);
    }
    static boolean isFibonacci(int n){
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }
    static int consecutiveFibonacci(int a, int b){
        if((a==1 && b==0) || (a==1 && b==1)){
            return 1;
        }
        else if((a==b) || ((a==1) && (b==1))){
            return 0;
        }
        int c = a - b;
        if(c>=0){
            return consecutiveFibonacci(b,c);
        }
        else{
            return 0;
        }
    }

}
