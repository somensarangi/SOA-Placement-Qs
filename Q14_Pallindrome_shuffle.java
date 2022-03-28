package SET1;
/*
Write a program to find whether it is possible to get a palindrome number from a given
number by re-arranging the positions of its digits. If yes, the program should print 2, else it
must print 1.
Example 1:
If the given number is 21251, it is possible to form a palindrome by re-arranging its digits, as
21512 or 12521. So, the program must print 2.
Example 2:
If the given number is 2125, it is not possible to form a palindrome by re-arranging its digits.
So, the program must print 1.
Assumption:
The input number will be positive integer number greater than or equal to 1 and less than or
equal to 25000.
 */
import java.util.*;
public class Q14_Pallindrome_shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        boolean ans = Palindrome(str);

        if(ans = true){
            System.out.println("Yes, it has a palindrome: 2");
        }else{
            System.out.println("No, it hasn't have palindrome: 1");
        }
    }
    static int MaxNum = 25000;
    static boolean Palindrome(String str){
        int count[] = new int[MaxNum];
        int oddOccurences = 0;
        Arrays.fill(count, 0);
        for(int i = 0; i<str.length(); i++) {
            count[(int)str.charAt(i)]++;
        }
        for(int i=0; i<MaxNum; i++){
            if((count[i] & 1)==1){
                oddOccurences++;
            }
            if(oddOccurences > 1)
                return false;

        }
        return  true;
    }
}
