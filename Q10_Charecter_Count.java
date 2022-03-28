package SET1;
/*
Write a java program to find minimum and maximum occurring character of a given
string.
 */
import java.util.*;
public class Q10_Charecter_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or a sentence: ");
        String str = sc.nextLine();
        int[] frequency = new int[str.length()];
        char minChar = str.charAt(0);
        char maxChar = str.charAt(0);
        int min, max;
        char string[] = str.toCharArray();
        for(int i = 0; i < string.length; i++)
        {
            frequency[i] = 1;
            for(int j = i+1; j < string.length; j++)
            {
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0')
                {
                    frequency[i]++;
                    string[j] = '0';
                }
            }
        }
        min = max = frequency[0];
        for(int i = 0; i <frequency.length; i++)
        {
            if(min > frequency[i] && frequency[i] != '0')
            {
                min = frequency[i];
                minChar = string[i];
            }
            if(max < frequency[i])
            {
                max = frequency[i];
                maxChar = string[i];
            }
        }
        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);
    }
}
