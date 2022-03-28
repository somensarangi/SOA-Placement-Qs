package SET1;
/*
Write a Java program to print all permutations of a given String. For example, if given
String is "GOD" then your program should print all 6 permutations of this string, e.g.,
"GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."
 */
import java.util.*;
public class Q11_String_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();
        StringPermutations(str, "");
    }
    static void StringPermutations(String str, String a){
        if(str.length()==0){
            System.out.println(a+" ");
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            String temp = str.substring(0, i)+ str.substring(i+1);
            StringPermutations(temp, a + ch);
        }
    }
}
