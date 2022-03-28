package SET1;
/*
Write a java program to find second largest element from a given unsorted integer array.
 */
import java.util.*;
public class Q7_2ndLargestNum_inUnsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements in the array");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array formed is: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("______________________________________");
        System.out.println("Second largest number in an unsorted array is: "+checkingSecondLargestNum(array));
    }
    static int checkingSecondLargestNum(int[] array){
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return (array[array.length - 2]);
    }
}
