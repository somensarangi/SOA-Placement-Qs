package SET1;
/*
Write a java program to remove duplicate element from a sorted array without using any
other data structure including array.
 */
import java.util.*;
public class Q3_Remove_duplicacy_in_sorted_array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements in the array of size "+size+" :");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("====================================================================================");
        System.out.println("Sorted Array is " + Arrays.toString(sortingArray(array)));
        int res = size;
        res = removeDuplicateElement(array, size);
        System.out.println("After removing duplicate elements in the array is :");
        for(int i = 0; i < res; i++){
            System.out.print(array[i]+" ");
        }
    }
    static int[] sortingArray(int[] array){

        for(int i = 0; i<array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    static int removeDuplicateElement(int[] array, int l){
        if(l==0|| l==1){
            return l;
        }
        int temp[] = new int[l];
        int j = 0;
        for(int i=0; i<l-1; i++){
            if (array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[l-1];
        for(int i=0; i<j; i++){
            array[i] = temp[i];
        }
        return j;
    }
}
