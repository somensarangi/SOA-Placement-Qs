package SET1;
/*
Write a java program to check whether a number is even or not without using arithmetic
or relational operator.
 */
import java.util.*;
public class Q5_Num_is_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking any number is even or not without using arithmetic or relational operators: ");
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        if(isEven(num) == 0){
            System.out.println(num + " is Even");
        }
        else{
            System.out.println(num + " is Odd");
        }
    }
    static int isEven(int num) {
        return (num & 1);
    }
}

